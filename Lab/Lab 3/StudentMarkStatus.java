// Lab 3, SCSE1224-24252 (StudentMarkStatus.java)
// Group Members:
// 1. AMMAR DANISH BIN ANWAR ZAMSANI
// 2. AQIL DZARFAN BIN ASRUL SHARAFF

class Student {
    private String name;
    private String course;
    public int cw; // coursework mark
    public int fe; // final exam mark
    public int total; // total mark (cw + fe)
    public String status; // "PASS" (total >= 50) otherwise "FAIL"

    public Student(String name, String course, int cw, int fe) {
        this.name = name;
        this.course = course;
        this.cw = cw;
        this.fe = fe;
    }

    @Override
    public String toString() {
        return name + " (" + course + ") - " + total + " (" + status + ")";
    }
}

@FunctionalInterface
interface Mark {
    public Student[] processTotalMark(Student[] studArray);
}

@FunctionalInterface
interface Status {
    public Student[] setStatus(Student[] studArray);
}

public class StudentMarkStatus {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Eve", "SCSE", 30, 10),
                new Student("Bob", "SCSR", 47, 20),
                new Student("Charlie", "SCSE", 65, 25),
                new Student("David", "SCSE", 20, 18),
                new Student("Adam", "SCSR", 53, 23)
        };

        Mark mark = (Student[] studArray) -> {
            for (Student stud : studArray) {
                stud.total = stud.cw + stud.fe;
            }
            return studArray;
        };

        Status status = (Student[] studArray) -> {
            for (Student stud : studArray) {
                stud.status = (stud.total >= 50) ? "PASS" : "FAIL";
            }
            return studArray;
        };

        students = status.setStatus(mark.processTotalMark(students));

        for (Student stud : students) {
            System.out.println(stud.toString());
        }
    }
}