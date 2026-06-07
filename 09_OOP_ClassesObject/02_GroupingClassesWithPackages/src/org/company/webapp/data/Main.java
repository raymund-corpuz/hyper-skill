package org.company.webapp.data;

public class Main {
    public static void main(String[] args) {

        User ray = new User();

        ray.name = "Raymund";
        ray.age = 31;
        ray.occupation = "Programmer";

        System.out.println("Project Name: Grouping Classes with Packages");
        System.out.println();
        System.out.println("Name: " + ray.name);
        System.out.println("Age: " + ray.age);
        System.out.println("Occupation: " + ray.occupation);
        System.out.println();
        System.out.println("End Of Program...");
    }
}
