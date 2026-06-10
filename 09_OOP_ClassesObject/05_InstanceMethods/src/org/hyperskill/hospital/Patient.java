package org.hyperskill.hospital;

public class Patient {
    String name;
    int age;
    String illness;
    boolean isAdmitted;
    double bill;

    public Patient(String name, int age, String illness, boolean isAdmitted, double bill) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.isAdmitted = isAdmitted;
        this.bill = bill;
    }

    public void displayPatient() {
        System.out.println(this.name + " - " + this.illness + " - " + (this.isAdmitted ? "Admitted" : "Discharged"));
    }

    public void processDischarge(int choice, Patient[] patient) {
        if (patient[choice - 1].isAdmitted) {
            System.out.println("Discharging " + patient[choice - 1].name);
            System.out.println("Discharge Successful!");
        } else {
            System.out.println("Patient Already Discharge");
        }
        patient[choice - 1].isAdmitted = false;
    }

    public static double findHighestBill(Patient[] patient) {
        double highest = patient[0].bill;

        for (int i = 0; i < patient.length; i++) {
            if (highest <= patient[i].bill) {
                highest = patient[i].bill;
            }
        }
        return highest;
    }
}
