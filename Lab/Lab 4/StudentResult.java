// Lab 4, SCSE1224-24252 (StudentResult.java)
// Group Members:
// 1. AMMAR DANISH BIN ANWAR ZAMSANI
// 2. AQIL DZARFAN BIN ASRUL SHARAFF

import java.util.*;

class Student {
    private String name;
    private int mark;
    private String course;

    public Student(String name, int mark, String course) {
        this.name = name;
        this.mark = mark;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return name + " (" + course + ") - " + mark;
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);

        List<Student> students = List.of(
                new Student("Eve", 85, "SCSE"),
                new Student("Bob", 67, "SCSR"),
                new Student("Charlie", 90, "SCSE"),
                new Student("David", 72, "SCSE"),
                new Student("Adam", 88, "SCSR"));

        int choice = 0;

        while (choice != 6) {
            System.out.println();
            System.out.println("1. Original list");
            System.out.println("2. Sort by name");
            System.out.println("3. Sort by mark");
            System.out.println("4. Marks > 70");
            System.out.println("5. SCSE Program");
            System.out.println("6. Exit");

            System.out.print("Your choice: ");
            choice = keyin.nextInt();
            keyin.nextLine();
            System.out.println();

            switch (choice) {
                case 1 -> {
                    System.out.println("Original list:");
                    students.stream()
                            .forEach(stud -> System.out.println(stud.toString()));
                    System.out.println("Press enter to continue...");
                    keyin.nextLine();
                }
                case 2 -> {
                    System.out.println("Sort by name list:");
                    students.stream()
                            .sorted(Comparator.comparing(Student::getName))
                            .forEach(stud -> System.out.println(stud.toString()));
                    System.out.println("Press enter to continue...");
                    keyin.nextLine();
                }
                case 3 -> {
                    System.out.println("Sort by mark list:");
                    students.stream()
                            .sorted(Comparator.comparing(Student::getMark).reversed())
                            .forEach(stud -> System.out.println(stud.toString()));
                    System.out.println("Press enter to continue...");
                    keyin.nextLine();
                }
                case 4 -> {
                    System.out.println("Students with mark > 70:");
                    students.stream()
                            .filter(stud -> stud.getMark() > 70)
                            .forEach(stud -> System.out.println(stud.toString()));
                    System.out.println("Press enter to continue...");
                    keyin.nextLine();
                }
                case 5 -> {
                    System.out.println("Students under SCSE Course:");
                    students.stream()
                            .filter(stud -> stud.getCourse() == "SCSE")
                            .forEach(stud -> System.out.println(stud.toString()));
                    System.out.println("Press enter to continue...");
                    keyin.nextLine();
                }
            }
        }
    }
}