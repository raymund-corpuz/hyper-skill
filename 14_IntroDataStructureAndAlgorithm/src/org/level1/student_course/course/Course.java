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

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", capacity=" + capacity +
                ", availableSlots=" + availableSlots +
                '}';
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

