package org.hyperskill.cinema;

public class Cinema {
    private String title;
    private String genre;
    private double ticketPrice;
    private int availableSeats;
    private int ticketsSold;

    //CONSTRUCTOR 1
    public Cinema(String title) {
        this.genre = "Unknown";
        this.ticketPrice = 250;
        this.availableSeats = 100;
        this.ticketsSold = 0;
    }

    //CONSTRUCTOR 2
    public Cinema(String title, String genre, double ticketPrice, int availableSeats) {
        this.title = title;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
        this.availableSeats = availableSeats;
    }

    void displayMovie() {
        System.out.println("Movie: " + this.title);
        System.out.println("Genre: " + this.genre);
        System.out.println("Price: " + this.ticketPrice);
        System.out.println("Available Seats: " + this.availableSeats);
        System.out.println();
    }

    void displayMovieDetails() {
        System.out.println("==== MOVIE DETAILS ====");
        System.out.println();
        System.out.println("Movie: " + this.title);
        System.out.println("Genre: " + this.genre);
        System.out.println();
        System.out.println("Ticket Price: " + this.ticketPrice);
        System.out.println("Available Seats: " + this.availableSeats);
        System.out.println("Ticket Sold: " + this.ticketsSold);
        System.out.println();
    }

    void bookTickets(int quantity) {
        this.ticketsSold = quantity;
        System.out.println("Booking Successful! ✅");
        System.out.println();
        System.out.println("Movie: " + this.title);
        System.out.println("Tickets Booked: " + this.ticketsSold);
        System.out.println("Remaining Seats: " + this.availableSeats);
    }

    int cancelTickets(int quantity) {
        this.ticketsSold = quantity;
        System.out.println("Cancellation Successful! ✅");
        System.out.println();
        System.out.println("Tickets Sold: " + this.ticketsSold);
        System.out.println("Available Seats: " + this.availableSeats);
        System.out.println();
    }

    double calculateRevenue() {
        return this.ticketsSold * this.ticketPrice;
    }

}
