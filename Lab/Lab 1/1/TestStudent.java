/*
 * AMMAR DANISH BIN ANWAR ZAMSANI
 * AQIL DZARFAN BIN ASRUL SHARAFF
 */

public class TestStudent {
    public static void main(String[] args) {
        String name = getValidArguments(args, 0);
        int carryMark = Integer.parseInt(getValidArguments(args, 1));
        int finalExam = Integer.parseInt(getValidArguments(args, 2));

        Student student = new Student();

        student.setName(name);
        student.setMarks(carryMark, finalExam);

        student.printResult();
    }

    public static String getValidArguments(String[] args, int index){
        if(index >= args.length){
            return "0";
        }

        return args[index];
    }
}