package org.hospital.app;

import org.hospital.people.Doctor;
import org.hospital.people.Patient;
import org.hospital.record.AppointmentRecord;

import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

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

        AppointmentRecord appointmentRecord = null;

        displayDoctors(doctors, patients);

        Doctor selectedDoctor = selectDoctor(scanner, doctors);
        if (selectedDoctor == null) {
            return;
        }
        doctorMenu();

        int selectedAction = selectAction(scanner);
        switch (selectedAction) {
            case 1:
                displayDoctorInformation(selectedDoctor);
                break;
            case 2:
                if (!selectedDoctor.isAvailable()) {
                    System.out.println();
                    System.out.println("Doctor is unavailable.");
                    break;
                }

                displayPatients(patients);

                Patient selectedPatient =
                        selectPatient(scanner, patients);

                if (selectedPatient == null) {
                    break;
                }

                appointmentRecord =
                        approveAppointment(
                                scanner,
                                selectedDoctor,
                                selectedPatient);

                break;
            case 3:
                displayAppointmentRecord(appointmentRecord);
                break;
            case 4:
                System.out.println("Exiting Program...");
                break;
            default:
                System.out.println("Invalid Action ❌");


        }

        scanner.close();
    }

    public static void displayDoctors(Doctor[] doctors, Patient[] patients) {
        System.out.println("============================================");
        System.out.println("          HOSPITAL APPOINTMENT SYSTEM       ");
        System.out.println("============================================");
        System.out.println()
        ;
        System.out.println("==== DOCTORS ====");
        System.out.println();
        for (int i = 0; i < doctors.length; i++) {
            System.out.println((i + 1) + ".");
            System.out.println(doctors[i].displayProfile());
            System.out.println();
        }

    }

    public static void displayPatients(Patient[] patients) {
        System.out.println("==== PATIENTS ====");
        for (int i = 0; i < patients.length; i++) {
            System.out.println((i + 1) + ".");
            System.out.println(patients[i].displayProfile());
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

    public static Patient selectPatient(Scanner scanner, Patient[] patients) {
        System.out.print("Choose Patient: ");
        int choice = scanner.nextInt() - 1;
        if (choice < 0 || choice >= patients.length) {
            System.out.println("Patient Not Found ❌");
            return null;
        }
        return patients[choice];
    }

    public static void doctorMenu() {
        System.out.println("==== DOCTOR MENU ====");
        System.out.println();
        System.out.println("1 - Display Doctor Information");
        System.out.println("2 - Approve Appointment");
        System.out.println("3 - View Appointment Record");
        System.out.println("4 - Exit");
        System.out.println();
    }

    public static void displayDoctorInformation(Doctor selectedDoctor) {
        System.out.println("==== DOCTOR PROFILE ====");
        System.out.println();
        System.out.println(selectedDoctor.displayProfile());
        System.out.println();
    }

    public static AppointmentRecord approveAppointment(Scanner scanner, Doctor selectedDoctor, Patient selectedPatient) {
        System.out.println("==== Appointment Details ====");
        System.out.println();
        System.out.print("Enter Appointment Date (MM/DD/YYYY): ");
        String appointmentDate = scanner.nextLine();
        System.out.println();
        System.out.print("Enter Appointment Time (HH:MM): ");
        String appointmentTime = scanner.nextLine();

        AppointmentRecord apRecord = new AppointmentRecord(selectedDoctor.getName(), selectedPatient.getName(), appointmentDate, appointmentTime);
        System.out.println();

        return apRecord;

    }


    public static int selectAction(Scanner scanner) {
        System.out.print("Choose Action: ");
        return scanner.nextInt();
    }

    public static void displayAppointmentRecord(AppointmentRecord record) {
        System.out.println("==== Appointment Record ====");
        System.out.println();
        System.out.println("Doctor : " + record.doctorName());
        System.out.println("Patient: " + record.patientName());
        System.out.println("Date   : " + record.appointmentDate());
        System.out.println("Time   : " + record.appointmentTime());
    }


}
