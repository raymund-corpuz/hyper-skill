package org.level1.student_course.app;

import org.level1.student_course.course.Course;
import org.level1.student_course.people.Student;
import org.level1.student_course.record.RegistrationRecord;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // =====================================================
        // Data Structures
        // =====================================================
        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        LinkedList<RegistrationRecord> registrationHistory = new LinkedList<>();

        //Array
        String[] courseCategory = {"Programming", "Database", "Networking", "Web Development", "Mathematics"};

        // =====================================================
        // Dummy Student Data
        // =====================================================

        students.add(
                new Student(
                        "STU-001",
                        "Raymund Corpuz",
                        31,
                        "raymund@gmail.com"
                )
        );

        students.add(
                new Student(
                        "STU-002",
                        "Alice Santos",
                        22,
                        "alice@gmail.com"
                )
        );

        students.add(
                new Student(
                        "STU-003",
                        "Michael Cruz",
                        24,
                        "michael@gmail.com"
                )
        );

        students.add(
                new Student(
                        "STU-004",
                        "Sophia Reyes",
                        21,
                        "sophia@gmail.com"
                )
        );

        students.add(
                new Student(
                        "STU-005",
                        "John Garcia",
                        23,
                        "john@gmail.com"
                )
        );

        // ========================================
        // DUMMY COURSE DATA
        // ========================================

        courses.add(
                new Course(
                        "CS101",
                        "Java Programming",
                        "John Smith",
                        30,
                        30
                )
        );

        courses.add(
                new Course(
                        "CS102",
                        "Data Structures",
                        "Sarah Lee",
                        25,
                        25
                )
        );

        courses.add(
                new Course(
                        "DB101",
                        "Database Systems",
                        "Robert Cruz",
                        25,
                        25
                )
        );

        courses.add(
                new Course(
                        "NET101",
                        "Computer Networking",
                        "David Santos",
                        30,
                        30
                )
        );

        courses.add(
                new Course(
                        "WEB101",
                        "Web Development",
                        "Maria Garcia",
                        25,
                        25
                )
        );

        // ===============================================
        // Main Program
        // ===============================================
        boolean running = true;

        while (running) {
            displayMenu();

            int option = optionSelection(scanner);

            switch (option) {
                case 1:
                    studentManagement(students, scanner);
                    break;
                case 2:
                    courseManagement(courses, scanner);
                    break;
                case 3:
                    registrationManagement(students, courses, registrationHistory, scanner);
            }
        }

    }

    // ==================================================
    // Display Main Menu
    // ==================================================
    public static void displayMenu() {
        System.out.println();
        System.out.println("========================================");
        System.out.println("        Student Course Registration     ");
        System.out.println("========================================");
        System.out.println();
        System.out.println("1. Student Management");
        System.out.println("2. Course Management");
        System.out.println("3. Register Student");
        System.out.println("4. Drop Course");
        System.out.println("5. Search");
        System.out.println("6. Sort");
        System.out.println("7. View Student Schedule");
        System.out.println("8. Registration History");
        System.out.println("9. Exit");
        System.out.println();
    }

    // ==================================================
    // Option Selection
    // ==================================================
    public static int optionSelection(Scanner scanner) {
        while (true) {
            System.out.print("Enter Choice: ");
            try {
                int option = scanner.nextInt();
                scanner.nextLine();

                return option;
            } catch (Exception e) {
                System.out.println("Invalid input.");
                System.out.println("Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    // ==================================================
    // Student Management
    // ==================================================
    public static void studentManagement(List<Student> students, Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("========================================");
            System.out.println("        Student Management              ");
            System.out.println("========================================");
            System.out.println();
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Back");
            System.out.println();

            int option = optionSelection(scanner);

            switch (option) {
                case 1:
                    System.out.println();
                    System.out.println("Student CRUD - Add");
                    System.out.println("Not Implemented yet.");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Student CRUD - View");
                    System.out.println("Not Implemented yet.");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Student CRUD - Update");
                    System.out.println("Not Implemented yet.");
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Student CRUD - Delete");
                    System.out.println("Not Implemented yet.");
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Student CRUD - Search");
                    System.out.println("Not Implemented yet.");
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Option.❌");
                    break;
            }
        }
    }

    //=========================================================
    //      Course Management
    //=========================================================
    public static void courseManagement(List<Course> courses, Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("========================================");
            System.out.println("          Course Management             ");
            System.out.println("========================================");
            System.out.println();
            System.out.println("1. Add Course");
            System.out.println("2. View Course");
            System.out.println("3. Update Course");
            System.out.println("4. Delete Course");
            System.out.println("5. Search Course");
            System.out.println("6. Back");
            System.out.println();

            int option = optionSelection(scanner);

            switch (option) {
                case 1:
                    System.out.println();
                    System.out.println("Course CRUD - Add");
                    System.out.println("Not Implemented yet.");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Course CRUD - View");
                    System.out.println("Not implemented yet.");
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Course CRUD - Update");
                    System.out.println("Not implemented yet.");
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Course CRUD - Delete");
                    System.out.println("Not implemented yet.");
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Course CRUD - Search");
                    System.out.println("Not implemented yet.");
                    break;

                case 6:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");

            }
        }
    }

    // ==============================================
    //      Registration Management
    // ==============================================
    public static void registrationManagement(List<Student> students, List<Course> courses, LinkedList<RegistrationRecord> registrationHistory, Scanner scanner) {
        System.out.println();
        System.out.println("=======================================");
        System.out.println("            Student Registration         ");
        System.out.println("=======================================");

        //Find Student
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        Student selectedStudent = null;

        for (Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(studentId)) {
                selectedStudent = student;
                break;
            }
        }

        //Student Not Found
        if (selectedStudent == null) {
            System.out.println();
            System.out.println("Student Not Found. ❌");
            return;
        }

        //Student Information
        System.out.println();
        System.out.println("Student Information");
        System.out.println("----------------------------------------");
        System.out.println("Student ID: " + selectedStudent.getStudentId());
        System.out.println("Name: " + selectedStudent.getName());

        //Display Course
        System.out.println();
        System.out.println("Available Courses");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            if (course.getAvailableSlots() > 0) {
                System.out.println((i + 1) + ". " + course.getCourseId() + " - " + course.getCourseName()
                        + " | Instructor: " + course.getInstructor() + " | Slots: " + course.getAvailableSlots());
            }
        }
        System.out.println();
        System.out.println("0. Cancel");

        //Course Selection
        System.out.println("Select Course: ");
        int option;
        try {
            option = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid Input.❌");
            scanner.nextLine();
            return;
        }

        //Cancel
        if (option == 0) {
            System.out.println();
            System.out.println("Registration Canceled.✅");
            return;
        }

        //Validate Option
        if (option < 1 || option > courses.size()) {
            System.out.println();
            System.out.println("Invalid course selection: ");
            return;
        }

        //Get Selected Course
        Course selectedCourse = courses.get(option - 1);

        //Check Duplicate Registration
        if (selectedStudent.getRegisteredCourses().contains(selectedCourse)) {
            System.out.println();
            System.out.println("Student is already registered for this course");
            return;
        }

        //Check Course Capacity
        if (!selectedCourse.registerStudent()) {
            System.out.println();
            System.out.println("Course is already full.");
            return;
        }

        //Register Course
        selectedStudent.registerCourse(selectedCourse);

        //Registration History
        registrationHistory.addLast(new RegistrationRecord(selectedStudent.getStudentId(), selectedStudent.getName(), selectedCourse.getCourseId(), selectedCourse.getCourseName(), "REGISTERED"));

        //Success Message
        System.out.println();
        System.out.println("================================================");
        System.out.println("            Registration Successful             ");
        System.out.println("================================================");
        System.out.println("Student: " + selectedStudent.getName());
        System.out.println("Course: " + selectedCourse.getCourseId() + " - " + selectedCourse.getCourseName());
        System.out.println("Available Slots: " + selectedCourse.getAvailableSlots());
    }

    // ==============================================
    //      Drop Course
    // ==============================================
    public static void dropCourse(List<Student> students, List<Course> courses, LinkedList<RegistrationRecord> registrationHistory, Scanner scanner) {
        System.out.println();
        System.out.println("=============================================");
        System.out.println("            Drop Course                     ");
        System.out.println("=============================================");

        //Find Student
        System.out.println("Enter Student ID: ");
        String studentId = scanner.nextLine();

        Student selectedStudent = null;

        for (Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(studentId)) {
                selectedStudent = student;
                break;
            }
        }

        //Student Not Found
        if (selectedStudent == null) {
            System.out.println();
            System.out.println("Student not found.❌");
            return;
        }

        //Student Information
        System.out.println();
        System.out.println("Student Information");
        System.out.println("-------------------------------------------");
        System.out.println("Student ID: " + selectedStudent.getStudentId());
        System.out.println("Name      : " + selectedStudent.getName());

        //Get Registered Courses
        List<Course> registeredCourses = selectedStudent.getRegisteredCourses();

        if (registeredCourses.isEmpty()) {
            System.out.println();
            System.out.println("Student is not registered for any course.");
            return;
        }

        //Display Registered Courses
        System.out.println();
        System.out.println("Registered Courses");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < registeredCourses.size(); i++) {
            Course course = registeredCourses.get(i);
            System.out.println((i + 1) + ". " + course.getCourseId() + " - " + course.getCourseName());
        }
        System.out.println();
        System.out.println("0. Cancel");

        //Course Selection
        System.out.println("Select course to drop: ");

        int option;
        try {
            option = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid Input.❌");
            scanner.nextLine();
            return;
        }

        // Cancel
        if (option == 0) {
            System.out.println("Drop course cancelled.");
            return;
        }

        //Validate Option
        if (option < 1 || option > registeredCourses.size()) {
            System.out.println("Invalid Course Selection.");
            return;
        }

        Course selectedCourse = courses.get(option - 1);

        //Confirmation
        System.out.println();
        System.out.println("Selected Course:");
        System.out.println("------------------------------------");
        System.out.println("Course ID: " + selectedCourse.getCourseId());
        System.out.println("Course Name: " + selectedCourse.getCourseName());
        System.out.println("Instructor: " + selectedCourse.getInstructor());
        System.out.println();
        System.out.println("Are you sure you want to drop this course?");
        System.out.println();
        System.out.println("1. Yes");
        System.out.println("2. No");

        int confirmation = optionSelection(scanner);

        if (confirmation != 1) {
            System.out.println();
            System.out.println("Drop Course Cancelled.");
            return;
        }

        //Drop Course
        selectedStudent.dropCourse(selectedCourse);
        selectedCourse.dropStudent();

        //Registration History
        registrationHistory.addLast(new RegistrationRecord(selectedStudent.getStudentId(), selectedStudent.getName(), selectedCourse.getCourseId(), selectedCourse.getCourseName(), "DROPPED"));

        //Success Message
        System.out.println();
        System.out.println("======================================");
        System.out.println("            Course Dropped            ");
        System.out.println("======================================");
        System.out.println("Student: " + selectedStudent.getName());
        System.out.println("Course: " + selectedCourse.getCourseId() + " - " + selectedCourse.getCourseName());
        System.out.println();
        System.out.println("Course Dropped Successfully.✅");
        System.out.println("Available Slots: " + selectedCourse.getAvailableSlots());

    }

}
    
    
