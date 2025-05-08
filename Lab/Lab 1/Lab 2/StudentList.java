// Lab 2-1, SCSE1224-24252 (StudentList.java)
// Group Members:
// 1. AMMAR DANISH BIN ANWAR ZAMSANI (A24CS0225)
// 2. AQIL DZARFAN BIN ASRUL SHARAFF (A24CS0049)

import java.util.Scanner;

public class StudentList {
  public static void main(String[] args) {
    System.out.println("Test StudentList Class\n");

    Scanner keyin = new Scanner(System.in);

    final int SIZE = 3;

    String [] names = new String[SIZE];
    int [] marks = new int[SIZE];

    // Students' name - mark examples:
    // Ahmad - 74, John - 46, Zety - 67

    // Get names and marks
    for (int i = 0; i < SIZE; i++) {
      System.out.print("Name: ");
      names[i] = keyin.nextLine();

      System.out.print("Mark: ");
      marks[i] = Integer.parseInt(keyin.nextLine());

      System.out.println();
    }

    // List names, marks and status
    for (int i = 0; i < SIZE; i++) {
      String status = "Fail";

      if (marks[i] >= 70) {
        status = "Excellent";
      } else if (marks[i] >= 50) {
        status = "Pass";
      }

      System.out.printf("%d. %s - %d - %s\n", i + 1, names[i], marks[i], status);
    }
  }
}