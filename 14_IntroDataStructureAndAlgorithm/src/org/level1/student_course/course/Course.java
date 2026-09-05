package org.level1.student_course.course;

public class Course {
    private String courseId;
    private String courseName;
    private String instructor;
    private int capacity;
    private int availableSlots;

    public Course(String courseId, String courseName, String instructor, int capacity, int availableSlots) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.capacity = capacity;
        this.availableSlots = availableSlots;
    }

    //Register a student
    public boolean registerStudent() {
        if (availableSlots <= 0) {
            return false;
        }
        availableSlots--;
        return true;
    }

    //Drop a student
    public boolean dropStudent() {
        if (availableSlots >= capacity) {
            return false;
        }
        availableSlots++;
        return true;
    }

    //Display Course
    public void displayCourse() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Capacity: " + capacity);
        System.out.println("Available Slots: " + availableSlots);
    }

    //getters & setters


    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(int availableSlots) {
        this.availableSlots = availableSlots;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}

