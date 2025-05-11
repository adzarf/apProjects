// Lab 2-1, SCSE1224-24252 (StudentList.java)
// Group Members:
// 1. AMMAR DANISH BIN ANWAR ZAMSANI (A24CS0225)
// 2. AQIL DZARFAN BIN ASRUL SHARAFF (A24CS0049)

import java.util.Scanner;
import java.util.ArrayList;

class Student {
    private String name;
    private int mark;

    public Student() {
        // do nothing
    }

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public String getStatus() {
        if (mark >= 70)
            return "Excellent";
        else if (mark >= 50)
            return "Pass";
        else
            return "Fail";
    }
}

public class StudentList {
    public static void main(String[] args) {
        System.out.println("Test StudentList Class\n");

        Scanner keyin = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Students' name - mark examples:
        // Ahmad - 74, John - 46, Zety - 67

        // Get names and marks
        System.out.print("Please type \"stop\" in name to finish entering student details.");

        while (true) {
            System.out.print("\nName: ");
            String name = keyin.nextLine();
            
            if (name.equalsIgnoreCase("stop")) break;

            System.out.print("Mark: ");
            int marks = Integer.parseInt(keyin.nextLine());
            students.add(new Student(name, marks));
        }

        // List names, marks and status
        students.forEach((student) -> {
            System.out.printf(
                "\n%s - %d - %s",
                student.getName(),
                student.getMark(),
                student.getStatus());
        });
    }
}