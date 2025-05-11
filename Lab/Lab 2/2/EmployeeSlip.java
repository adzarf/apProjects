// Lab 2-2, SCSE1224-24252 (EmployeeSlip.java)
// Group Members:
// 1. AMMAR DANISH BIN ANWAR ZAMSANI
// 2. AQIL DZARFAN BIN ASRUL SHARAFF

abstract class Employee {
    protected String name;
    protected String icNo;

    public Employee(String name, String icNo) {
        this.name = name;
        this.icNo = icNo;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("IC No.: " + icNo);
    }

    public abstract void printSlip();
}

interface DailyJob {
    public static final double RATE = 12.5;

    public abstract double calculateSalary();
}

interface HourlyJob {
    public static final double PART_TIME_RATE = 6.5;
    public static final double OVERTIME_RATE = 18.8;

    public abstract double calculateWage();
}

class ContractStaff extends Employee implements DailyJob, HourlyJob {
    private int workDays;
    private int overtimeHours;

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public ContractStaff(String name, String icNo, int workDays, int overtimeHours) {
        super(name, icNo);
        this.workDays = workDays;
        this.overtimeHours = overtimeHours;
    }

    public void printSlip() {
        System.out.println("CONTRACT STAFF SALARY SLIP");
        printInfo();
        System.out.printf("Working Days & Rate: %d x RM %.2f\n", workDays, RATE);
        System.out.printf("Overtime Hours & Rate: %d x RM %.2f\n", overtimeHours, OVERTIME_RATE);
        System.out.printf("Total Salary: RM %.2f\n", calculateSalary());
    }

    public double calculateSalary() {
        return workDays * RATE + calculateWage();
    }

    public double calculateWage() {
        return overtimeHours * OVERTIME_RATE;
    }
}

class PartTimeStaff extends Employee implements HourlyJob {
    private int workHours;

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public PartTimeStaff(String name, String icNo, int workHours) {
        super(name, icNo);
        this.workHours = workHours;
    }

    public void printSlip() {
        System.out.println("PARTTIME STAFF SALARY SLIP");
        printInfo();
        System.out.printf("Working Hours & Rate: %d x RM %.2f\n", workHours, PART_TIME_RATE);
        System.out.printf("Total Salary: RM %.2f\n", calculateWage());
    }

    public double calculateWage() {
        return workHours * PART_TIME_RATE;
    }
}

public class EmployeeSlip {
    public static void main(String[] args) {
        PartTimeStaff ps = new PartTimeStaff("Adam", "A123", 13);
        ContractStaff cs = new ContractStaff("Alice", "A456", 20, 16);

        ps.printSlip();
        System.out.println();
        cs.printSlip();
    }
}