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

        scanner.close();
    }

    public static void displayAllMovies(Cinema[] movies) {
        for (int i = 0; i < movies.length; i++) {
            movies[i].displayMovie(i);
        }
    }
}
