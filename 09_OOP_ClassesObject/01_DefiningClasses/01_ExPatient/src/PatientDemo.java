public class PatientDemo {
    public static void main(String[] args) {

        Patient john = new Patient();

        john.name = "John Diggle";
        john.age = 34;
        john.height = 6.2;

        System.out.println("Project Name: Patient Info");
        System.out.println();

        System.out.println(john.name);
        System.out.println(john.age);
        System.out.println(john.height);
        System.out.println(john.name + " is a retired army at the age of " + john.age + " he is " + john.height + " feet tall.");

        Patient alice = new Patient();

        alice.name = "Alice Go";
        alice.age = 24;
        alice.height = 5.4;

        System.out.println(alice.name + " is a model at the age of " + alice.age);
        System.out.println();
        System.out.println("End Of Program...");
    }
}

class Patient {
    String name;
    int age;
    double height;
}
