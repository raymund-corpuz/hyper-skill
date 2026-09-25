package hyperskill.hotel.management.repository.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public List<String> readAll(Path path) {

        try {
            if (!Files.exists(path)) {
                return new ArrayList<>();
            }
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException("Unable to read file: " + path, e);
        }

    }

    public void writeAll(Path path, List<String> lines) {

        try {
            Files.write(path, lines);

        } catch (IOException e) {
            throw new RuntimeException("Unable to write file: " + path, e);
        }
    }

}
