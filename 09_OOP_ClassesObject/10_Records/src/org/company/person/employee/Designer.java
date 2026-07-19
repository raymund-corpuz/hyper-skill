package org.company.person.employee;

public class Designer extends Employee {
    protected String designTool;


    public Designer(String name, int age, String department, double salary, String designTool) {
        super(name, age, department, salary);
        this.designTool = designTool;
    }

    @Override
    public String displayProfile() {
        return super.displayProfile() +
                "\nPosition: " + "Designer" +
                "\nDesignTool: " + designTool;
    }

    @Override
    public void performJob() {
        System.out.println("Creating design using " + designTool + "...");
    }
}
