package org.level1.student_course.people;

import org.level1.student_course.course.Course;

import java.util.ArrayList;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private String email;
    private ArrayList<Course> registeredCourses;

    public Student(String studentId, String name, int age, String email) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.registeredCourses = new ArrayList<>();
    }

    //Register a course
    public void registerCourse(Course course) {
        System.out.println("Successfully Registered.✅");
        registeredCourses.add(course);
    }

    //Drop a course
    public void dropCourse(Course course) {
        registeredCourses.remove(course);
    }

    public void displayProfile() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Registerd Courses: ");

        if (registeredCourses.isEmpty()) {
            System.out.println("No Registered Courses.❌");
        } else {
            for (Course course : registeredCourses) {
                System.out.println(course.getCourseId() + " - " + course.getCourseName());
            }
        }
    }

    //getters & setters

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public ArrayList<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(ArrayList<Course> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
