package org.hospital.app;

import org.hospital.people.Doctor;
import org.hospital.people.Patient;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Doctor[] doctors = new Doctor[3];
        Patient[] patients = new Patient[5];

        // POPULATED DATA

        doctors[0] = new Doctor(
                "Dr. Maria Santos",
                45,
                "Cardiology",
                true
        );

        doctors[1] = new Doctor(
                "Dr. James Cruz",
                50,
                "Pediatrics",
                false
        );

        doctors[2] = new Doctor(
                "Dr. Angela Reyes",
                38,
                "Orthopedics",
                true
        );

        patients[0] = new Patient(
                "Raymund Corpuz",
                31,
                "Flu",
                201
        );

        patients[1] = new Patient(
                "Alice Johnson",
                24,
                "Migraine",
                105
        );

        patients[2] = new Patient(
                "John Smith",
                40,
                "Broken Arm",
                302
        );

        patients[3] = new Patient(
                "Sophia Garcia",
                19,
                "Asthma",
                110
        );

        patients[4] = new Patient(
                "Michael Tan",
                55,
                "Heart Disease",
                401
        );

        displayDoctors(doctors);

        scanner.close();
    }

    public static void displayDoctors(Doctor[] doctors) {
        System.out.println("==== Doctors ====");
        System.out.println();
        for (int i = 0; i < doctors.length; i++) {
            System.out.println((i + 1));
            System.out.println(doctors[i].displayProfile());
            System.out.println();
        }
    }

    public static Doctor selectDoctor(Scanner scanner, Doctor[] doctors) {
        System.out.print("Choose a doctor: ");
        int selectedDoctor = scanner.nextInt() - 1;

        if (selectedDoctor < 0 || selectedDoctor >= doctors.length) {
            System.out.println("Doctor Not Found ❌");
            return null;
        }
        return doctors[selectedDoctor];
    }

    public static void approveAppointment(Doctor selectedDoctor) {
        
    }
}
