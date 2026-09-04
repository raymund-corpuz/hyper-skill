package org.level1.student_course.app;

import org.level1.student_course.course.Course;
import org.level1.student_course.people.Student;
import org.level1.student_course.record.RegistrationRecord;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        LinkedList<RegistrationRecord> registrationHistory = new LinkedList<>();

        String[] courseCategories = {
                "Programming",
                "Database",
                "Networking",
                "Web Development",
                "Mathematics"
        };

        // ------------------ Student ------------------------
        students.add(new Student(
                "STU-001",
                "Raymund Corpuz",
                31,
                "raymund@gmail.com",
                "Computer Science"
        ));

        students.add(new Student(
                "STU-002",
                "Alice Santos",
                22,
                "alice@gmail.com",
                "Information Technology"
        ));

        students.add(new Student(
                "STU-003",
                "Michael Cruz",
                24,
                "michael@gmail.com",
                "Computer Science"
        ));

        students.add(new Student(
                "STU-004",
                "Sophia Reyes",
                21,
                "sophia@gmail.com",
                "Information Technology"
        ));

        students.add(new Student(
                "STU-005",
                "John Garcia",
                23,
                "john@gmail.com",
                "Computer Science"
        ));

        //-------------- Courses ----------------------
        courses.add(new Course(
                "CS101",
                "Java Programming",
                "John Smith",
                30,
                30
        ));

        courses.add(new Course(
                "CS102",
                "Data Structures",
                "Sarah Lee",
                25,
                25
        ));

        courses.add(new Course(
                "DB101",
                "Database Systems",
                "Robert Cruz",
                25,
                25
        ));

        courses.add(new Course(
                "NET101",
                "Computer Networking",
                "David Santos",
                30,
                30
        ));

        courses.add(new Course(
                "WEB101",
                "Web Development",
                "Maria Garcia",
                25,
                25));

        boolean running = true;

        while (running) {
            displayMainMenu();
            int options = optionSelection(scanner);

            switch (options) {
                case 1:
                    System.out.println("Student Management");
                    break;
                case 2:
                    System.out.println("Course Management");
                    break;
                case 3:
                    System.out.println("Register Student");
                    break;
                case 4:
                    System.out.println("Drop Course");
                    break;
                case 5:
                    searchingStudentAndCourse(students, courses, scanner);
                    break;
                case 6:
                    System.out.println("Sort");
                case 7:
                    System.out.println("View Student Schedule");
                    break;
                case 8:
                    System.out.println("Registration History");
                    break;
                case 9:
                    System.out.println("Exiting the Program....");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Options.❌");
                    running = false;
            }
        }
        //close
        scanner.close();
    }

    // --------- Main Menu --------------------
    public static void displayMainMenu() {
        System.out.println("========================================");
        System.out.println("   STUDENT COURSE REGISTRATION SYSTEM   ");
        System.out.println("========================================");
        System.out.println();
        System.out.println("1 - Student Management");
        System.out.println("2 - Course Management");
        System.out.println("3 - Registration Management");
        System.out.println("4 - Drop Course");
        System.out.println("5 - Search");
        System.out.println("6 - Sort");
        System.out.println("7 - View Student Schedule");
        System.out.println("8 - Registration History");
        System.out.println("9 - Exit");
    }

    // ------------ Option Selection -------------
    public static int optionSelection(Scanner scanner) {
        System.out.println();
        System.out.println("Enter Choice: ");
        int options = scanner.nextInt();
        scanner.nextLine();
        return options;
    }

    //----------- Student Management --------------
    public static void studentManagement(Scanner scanner) {
        System.out.println("==== Student Management ====");
        System.out.println();
        System.out.println("1 - Add Student");
        System.out.println("2 - View Student");
        System.out.println("3 - Update Student");
        System.out.println("4 - Delete Student");
        System.out.println("5 - Search Student");
        System.out.println("6 - Back");

        int options = optionSelection(scanner);

        switch (options) {
            case 1:
                System.out.println("Add Student");
                System.out.println("Adding Student...");
                break;
            case 2:
                System.out.println("View Student");
                System.out.println("Viewing Student...");
                break;
            case 3:
                System.out.println("Updating Student...");
                break;
            case 4:
                System.out.println("Deleting Student...");
                break;
            case 5:
                System.out.println("Searching Student...");
                break;
            case 6:
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid Options. ❌");
                break;
        }


    }

    //---------- Course Management ----------------
    public static void viewManagement(Scanner scanner) {
        System.out.println("==== Course Management ====");
        System.out.println();
        System.out.println("1 - Add Course");
        System.out.println("2 - View Courses");
        System.out.println("3 - Update Course");
        System.out.println("4 - Delete Course");
        System.out.println("5 - Search Course");
        System.out.println("6 - Back");

        int options = optionSelection(scanner);

        switch (options) {
            case 1:
                System.out.println("Adding Course...");
                break;
            case 2:
                System.out.println("Viewing Course...");
                break;
            case 3:
                System.out.println("Updating Course...");
                break;
            case 4:
                System.out.println("Deleting Course...");
                break;
            case 5:
                System.out.println("Searching Course...");
                break;
            case 6:
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid Options. ❌");
                break;
        }
    }

    //---------- Registration Management -------------

    //---------- Searching --------------------
    public static void searchingStudentAndCourse(List<Student> students, List<Course> courses, Scanner scanner) {
        System.out.println();
        System.out.println("==== Searching ====");
        System.out.println();
        System.out.println("1 - Search by Id: ");
        System.out.println("2 - Search by Name: ");
        System.out.println("3 - Search by Course:");
        System.out.println();
        int options = optionSelection(scanner);

        switch (options) {
            case 1:
                System.out.println("Enter Student ID: ");
                String studentId = scanner.nextLine();

                for (Student student : students) {
                    if (student.getStudentId().equalsIgnoreCase(studentId)) {
                        System.out.println("Student Found.✅ ");
                        System.out.println();
                        student.displayProfile();
                        System.out.println();
                    }
                }
                break;
            case 2:
                System.out.println("Enter Student Name: ");
                String name = scanner.nextLine();

                for (Student student : students) {
                    if (student.getName().equalsIgnoreCase(name)) {
                        System.out.println("Student Found.✅");
                        student.displayProfile();
                        System.out.println();
                    }
                }
                break;
            case 3:
                System.out.println("Enter Course ID: ");
                String courseId = scanner.nextLine();
                for (Course course : courses) {
                    if (course.getCourseId().equalsIgnoreCase(courseId)) {
                        System.out.println("Course Found: ");
                        System.out.println(course.getCourseId() + " | " + course.getCourseName());
                        System.out.println();
                    }
                }
                break;
            default:
                System.out.println("Invalid Option. ❌");
                break;
        }
    }

    //---------- Sort ---------------------
    public static void sortingStudentAndCourse(List<Student> students, List<Course> courses, Scanner scanner) {

    }
}

