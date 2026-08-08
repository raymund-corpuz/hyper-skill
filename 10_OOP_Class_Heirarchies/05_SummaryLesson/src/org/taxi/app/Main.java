package org.taxi.app;

import org.taxi.interfaces.FareCalculator;
import org.taxi.people.Customer;
import org.taxi.record.BookingRecord;
import org.taxi.vehicle.Taxi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Taxi> taxis = new ArrayList<>();
        ArrayList<BookingRecord> records = new ArrayList<>();

        FareCalculator specialFare = new FareCalculator() {
            @Override
            public double calculate(double distance) {
                return distance * 30;
            }
        }
    }


}
