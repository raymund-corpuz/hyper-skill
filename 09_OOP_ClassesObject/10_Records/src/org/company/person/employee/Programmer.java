package org.company.person.employee;

public class Programmer extends Employee {
    protected String programmingLanguages;


    public Programmer(String name, int age, String department, double salary, String programmingLanguages) {
        super(name, age, department, salary);
    }

    @Override
    public String displayProfile() {
        return super.displayProfile() +
                "\nPosition: " + "Programmer" +
                "\nLanguage: " + programmingLanguages;
    }

    @Override
    public void performJob() {
        System.out.println("Writing the code using " + programmingLanguages);
    }


}
