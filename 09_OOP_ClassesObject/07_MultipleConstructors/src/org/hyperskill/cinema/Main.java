package org.hyperskill.cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema[] movie = new Cinema[5];

        movie[0] = new Cinema("Avengers: Endgame", "Action", 350, 100);
        movie[1] = new Cinema("Interstellar", "Sci-fi", 300, 80);
        movie[2] = new Cinema("John Wick 4", "Action", 320, 50);
        movie[3] = new Cinema("Inside Out 2", "Animation", 250, 120);
        movie[4] = new Cinema("Mission Impossible");

        displayAllMovies(movie);
        System.out.println();
        int movieChoice = selectMovie(scanner, movie);
        displayTransactionMenu();

        scanner.close();
    }

    public static void displayAllMovies(Cinema[] movies) {
        for (int i = 0; i < movies.length; i++) {
            movies[i].displayMovie(i);
        }
    }

    public static int selectMovie(Scanner scanner, Cinema[] movie) {
        System.out.println();
        System.out.println("Choose Movie: ");
        int movieChoice = scanner.nextInt();
        movieChoice--;
        if (movieChoice < 0 || movieChoice >= movie.length) {
            System.out.println("Invalid Choice❌");
            return -1;
        }
        return movieChoice;
    }

    public static void displayTransactionMenu() {
        System.out.println();
        System.out.println("==== TRANSACTIONS ====");
        System.out.println();
        System.out.println("1 - Book Tickets");
        System.out.println("2 - Cancel Tickets");
        System.out.println("3 - View Movie Details");
        System.out.println("4 - Find Highest Revenue Movie");
        System.out.println("5 - Exit");
        System.out.println();
    }
}
