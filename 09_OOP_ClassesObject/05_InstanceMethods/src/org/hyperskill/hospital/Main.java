package org.hyperskill.hospital;

import java.util.Scanner;

import static org.hyperskill.hospital.Patient.findHighestBill;

public class Main {
    public static void main(String[] args) {
        Patient[] patient = new Patient[5];
        Scanner scanner = new Scanner(System.in);

        patient[0] = new Patient("Raymund", 31, "Flu", true, 35_000);
        patient[1] = new Patient("Rachel", 21, "Back pain", true, 2_500);
        patient[2] = new Patient("Raybern", 34, "Fever", true, 5_000);
        patient[3] = new Patient("Ruzel", 21, "Mental Disorder", false, 0);
        patient[4] = new Patient("Justine", 11, "Flu", true, 15_000);

        System.out.println("Project Name: Hospital Patient Management System - Summary Lesson");
        System.out.println();
        System.out.println("==== HOSPITAL PATIENT SYSTEM ====");
        for (int i = 0; i < patient.length; i++) {
            patient[i].displayPatient();
        }
        System.out.println();
        System.out.print("Choose Patient to Discharge: ");
        int choice = scanner.nextInt();

        patient[choice - 1].processDischarge(choice, patient);
        System.out.println();
        double result = 0;

        result = findHighestBill(patient);

        System.out.println("Highest Bill: " + result);
        System.out.println();
        System.out.println("End Of Program...");
        scanner.close();

    }
}
