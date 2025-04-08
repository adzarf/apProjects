public class Student {
    private String name;
    private int carryMark;
    private int finalExam;

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int carryMark, int finalExam) {
        this.carryMark = carryMark;
        this.finalExam = finalExam;
    }

    public int getTotalMark() {
        return carryMark + finalExam;
    }

    public String getGrade() {
        if(this.getTotalMark() < 50 ) {
            return "FAIL";
        }
        else {
            return "PASS";
        }
    }

    public void printResult() {
        System.out.println("      Name: " + this.name);
        System.out.println("Total Mark: " + this.getTotalMark());
        System.out.println("     Grade: " + this.getGrade());
    }
}