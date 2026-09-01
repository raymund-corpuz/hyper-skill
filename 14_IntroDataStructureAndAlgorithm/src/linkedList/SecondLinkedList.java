package linkedList;

import java.util.LinkedList;

public class SecondLinkedList {
    public static void main(String[] args) {
        LinkedList<String> student = new LinkedList<>();

        student.add("Raymund");
        student.add("George");
        student.add("Alice");
        student.add("Jennifer");
        student.add("Allison");

        System.out.println("Student List: " + student);


        String firstStudent = student.getFirst();
        String lastStudent = student.getLast();

        System.out.println();
        System.out.println("First Student: " + firstStudent);
        System.out.println("Last Student: " + lastStudent);
        System.out.println();
        student.remove(2);
        System.out.println("Updated List: " + student);

        System.out.println();
        System.out.println("Total students: " + student.size());

    }
}
