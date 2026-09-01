package linkedList;

import java.util.LinkedList;
//volvo, bmw, ford, tesla,mazda

public class FirstLinkedList {
    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<>();

        cars.add("Mazda");
        cars.add("Tesla");
        cars.add("BMW");

        cars.addLast("Ford");
        cars.addFirst("Volvo");

        System.out.println("Original List: " + cars);

        String first = cars.getFirst();
        String last = cars.get(2);
        System.out.println("First: " + first);
        System.out.println("Index [2]: " + last);

        cars.removeLast();
        cars.remove("Mazda");
        cars.set(0, "Honda");

        System.out.println("Updated List: " + cars);

    }
}
