package org.hyperskill.java.packages.theory.p1;

import org.hyperskill.java.packages.theory.p2.B.UserB;

public class UserA {
    public static void main(String[] args) {
        UserB raemun = new UserB();

        raemun.userName = "Raymund";
        raemun.userAge = 31;
        raemun.userSalary = 10_000;

        System.out.println("Project Name: Access Class from Different Package");
        System.out.println();
        System.out.println("Name User B: " + raemun.userName);
        System.out.println("Age User B: " + raemun.userAge);
        System.out.println("Salary User B: " + raemun.userSalary);
        System.out.println();
        System.out.println("End Of Program...");
    }
}
