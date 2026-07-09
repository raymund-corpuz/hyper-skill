package org.hyperskill.school.people;

public class Student extends Person {
    protected String course;
    protected String section;

    public Student(String name, int age, String course, String section) {
        super(name, age);
        this.course = course;
        this.section = section;
    }

    @Override
    public String displayInfo() {
        return "Name: " + name +
                "\nCourse: " + course +
                "\nSection " + section;
    }

    public String updateSection(String newSection) {
        this.section = newSection;
        return "Section: Updated Successfully ✅";

    }


}
