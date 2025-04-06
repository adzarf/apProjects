import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        System.out.println("Test Vehicle Class\n");

        System.out.println("Build Vios:\n");
        Car c1 = new Car();
        c1.setModel("Vios");
        c1.setHorsePower(80);
        System.out.println(c1.getInfo());

        System.out.println("Build Persona:\n");
        Car c2 = new Car("Persona", 88);
        System.out.println(c2.getInfo());

        System.out.println("Interactively build a car:\n");
        CarFactory cf = new CarFactory();
        Car c3 = cf.buildCar();
        System.out.println(c3.getInfo());

        System.out.println("Modify the car to becomes Civic...\n");
        cf.modifyCar(c3, "Civic", 127);
        System.out.println(c3.getInfo());
    }
}