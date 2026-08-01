import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecretMessageDecoder {

    private static class Entry {
        final int x;
        final String character;
        final int y;

        Entry(int x, String character, int y) {
            this.x = x;
            this.character = character;
            this.y = y;
        }
    }

    private static String toExportUrl(String docUrl) {
        Matcher publishedMatch = Pattern.compile("/document/d/e/([a-zA-Z0-9_-]+)").matcher(docUrl);
        if (publishedMatch.find()) {
            return docUrl;
        }

        Matcher editMatch = Pattern.compile("/document/d/([a-zA-Z0-9_-]+)").matcher(docUrl);
        if (editMatch.find()) {
            String docId = editMatch.group(1);
            return "https://docs.google.com/document/d/" + docId + "/export?format=html";
        }

        return docUrl;
    }

    private static String stripTags(String html) {
        return html.replaceAll("(?is)<[^>]+>", "").trim();
    }

    private static List<Entry> parseGridTable(String html) {
        List<Entry> entries = new ArrayList<>();

        Matcher tableMatch = Pattern.compile("(?is)<table[^>]*>(.*?)</table>").matcher(html);
        if (!tableMatch.find()) {
            throw new IllegalStateException("No table found in the document HTML.");
        }
        String tableHtml = tableMatch.group(1);

        Matcher rowMatch = Pattern.compile("(?is)<tr[^>]*>(.*?)</tr>").matcher(tableHtml);
        boolean first = true;

        while (rowMatch.find()) {
            if (first) {
                first = false;
                continue;
            }

            String rowHtml = rowMatch.group(1);
            List<String> cells = new ArrayList<>();
            Matcher cellMatch = Pattern.compile("(?is)<t[dh][^>]*>(.*?)</t[dh]>").matcher(rowHtml);
            while (cellMatch.find()) {
                cells.add(stripTags(cellMatch.group(1)));
            }

            if (cells.size() < 3) {
                continue;
            }

            String xText = cells.get(0);
            String charText = cells.get(1);
            String yText = cells.get(2);

            if (!xText.matches("\\d+") || !yText.matches("\\d+") || charText.isEmpty()) {
                continue;
            }

            entries.add(new Entry(Integer.parseInt(xText), charText, Integer.parseInt(yText)));
        }

        return entries;
    }

    public static void printSecretMessage(String docUrl) throws IOException, InterruptedException {
        String exportUrl = toExportUrl(docUrl);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(exportUrl))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new IOException("Failed to fetch document, HTTP status: " + response.statusCode());
        }

        List<Entry> entries = parseGridTable(response.body());
        if (entries.isEmpty()) {
            System.out.println("(no grid data found)");
            return;
        }

        int maxX = 0;
        int maxY = 0;
        for (Entry e : entries) {
            maxX = Math.max(maxX, e.x);
            maxY = Math.max(maxY, e.y);
        }

        int width = maxX + 1;
        int height = maxY + 1;

        char[][] grid = new char[height][width];
        for (char[] row : grid) {
            java.util.Arrays.fill(row, ' ');
        }

        for (Entry e : entries) {
            grid[e.y][e.x] = e.character.charAt(0);
        }

        StringBuilder output = new StringBuilder();
        for (int y = height - 1; y >= 0; y--) {
            output.append(new String(grid[y])).append(System.lineSeparator());
        }
        System.out.print(output);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length != 1) {
            System.out.println("Usage: java SecretMessageDecoder <published_google_doc_url>");
            System.exit(1);
        }
        printSecretMessage(args[0]);
    }
}