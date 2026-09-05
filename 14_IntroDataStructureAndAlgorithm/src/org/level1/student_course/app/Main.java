package org.level1.student_course.app;

import org.level1.student_course.course.Course;
import org.level1.student_course.people.Student;
import org.level1.student_course.record.RegistrationRecord;

import java.util.*;

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
                "raymund@gmail.com"

        ));

        students.add(new Student(
                "STU-002",
                "Alice Santos",
                22,
                "alice@gmail.com"

        ));

        students.add(new Student(
                "STU-003",
                "Michael Cruz",
                24,
                "michael@gmail.com"
        ));

        students.add(new Student(
                "STU-004",
                "Sophia Reyes",
                21,
                "sophia@gmail.com"
        ));

        students.add(new Student(
                "STU-005",
                "John Garcia",
                23,
                "john@gmail.com"
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
                    studentManagement(scanner);
                    break;
                case 2:
                    courseManagement(scanner);
                    break;
                case 3:
                    registrationManagement(students, courses, registrationHistory, scanner);
                    break;
                case 4:
                    dropCourse(students, courses, scanner);
                    break;
                case 5:
                    searchingStudentAndCourse(students, courses, scanner);
                    break;
                case 6:
                    sortingStudentAndCourse(students, courses, scanner);
                    break;
                case 7:
                    System.out.println("Student Schedule");
                    break;
                case 8:
                    viewRegistrationHistory(registrationHistory);
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
    public static void courseManagement(Scanner scanner) {
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

    //---------- Registration Management ---------------
    public static void registrationManagement(List<Student> students, List<Course> courses, LinkedList<RegistrationRecord> registrationHistory, Scanner scanner) {
        System.out.println("=============================================");
        System.out.println("                 Register Student            ");
        System.out.println("=============================================");
        System.out.println();
        System.out.println("Enter Student ID: ");
        String studentId = scanner.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equalsIgnoreCase(studentId)) {
                System.out.println("Student: ");
                System.out.println(students.get(i).getName());
            }
        }

        System.out.println();
        System.out.println("Available Courses: ");
        System.out.println();
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i).getCourseId() + " - " + courses.get(i).getCourseName());
        }
        System.out.println();
        System.out.println("Select from Available Courses");
        System.out.println("----------------------------------------");
        int options = optionSelection(scanner);
        options--;
        if (options < 0 || options >= courses.size()) {
            System.out.println("Course Not Found.❌");
            return;
        }

        for (Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(studentId)) {
                Course selectedCourse = courses.get(options);
                System.out.println();
                student.registerCourse(selectedCourse);
                registrationHistory.addLast(new RegistrationRecord(studentId, student.getName(), selectedCourse.getCourseId(), selectedCourse.getCourseName(), "REGISTERED"));
            }
        }
    }

    // -------------- Drop Course ----------------------------
    public static void dropCourse(List<Student> students, List<Course> courses, Scanner scanner) {
        System.out.println("========================================");
        System.out.println("              DROP COURSE               ");
        System.out.println("========================================");
        System.out.println();
        System.out.println("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.println();
        System.out.println("Student Information");
        System.out.println("----------------------------------------");
        for (Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(studentId)) {
                System.out.println("Student ID: " + student.getStudentId());
                System.out.println("Name      : " + student.getName());
                System.out.println("Program   : Computer Science");
            }
        }
        System.out.println("Registered Courses");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equalsIgnoreCase(studentId)) {
                for (Course course : courses) {
                    System.out.println(course);
                }
            }
        }
        System.out.println();
        System.out.println("-----------------------------------------");
        int options = optionSelection(scanner);
        options--;
        if (options < 0 || options >= courses.size()) {
            System.out.println("Course Not Found.❌");
            return;
        }
        Course selectedCourse = courses.get(options);

        for (Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(studentId)) {
                student.dropCourse(selectedCourse);
                selectedCourse.dropStudent();
            }
        }
    }

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
        System.out.println("==== Sort Student ====");
        System.out.println();
        System.out.println("1 - Sort Student By Name: ");
        System.out.println("2 - Sort Student By ID: ");
        System.out.println("3 - Sort Student By Age: ");

        int options = optionSelection(scanner);

        switch (options) {
            case 1:
                System.out.println("==== Students Sorted By Name ====");
                System.out.println();
                students.sort(Comparator.comparing(Student::getName));
                for (Student student : students) {
                    System.out.println(student.getName());
                }
                System.out.println();
                break;
            case 2:
                System.out.println("==== Students Sorted By ID ====");
                System.out.println();
                students.sort(Comparator.comparing(Student::getStudentId));
                for (Student student : students) {
                    System.out.println(student.getStudentId() + " | " + student.getName());
                }
                System.out.println();
                break;
            case 3:
                System.out.println("==== Student Sorted By Age ====");
                System.out.println();
                students.sort(Comparator.comparing(Student::getAge));
                for (Student student : students) {
                    System.out.println(student.getName() + " | " + student.getAge());
                }
                System.out.println();
                break;
            default:
                System.out.println("Invalid Options. ❌");
                break;
        }
    }

    // -------------- View Registration History ---------------
    public static void viewRegistrationHistory(LinkedList<RegistrationRecord> registrationRecords) {
        System.out.println("=============================================");
        System.out.println("            Registration History             ");
        System.out.println("=============================================");
        System.out.println();
        if (registrationRecords.isEmpty()) {
            System.out.println("Registration History: No Record Found. ❌");
            return;
        }

        for (RegistrationRecord record : registrationRecords) {
            System.out.println("Student ID: " + record.studentId());
            System.out.println("Student Name: " + record.studentName());
            System.out.println("Course ID: " + record.courseId());
            System.out.println("Course Name: " + record.courseName());
            System.out.println("Status: " + record.action());
            System.out.println();
        }
    }
}






