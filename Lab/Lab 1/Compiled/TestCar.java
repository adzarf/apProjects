/*
 * AMMAR DANISH BIN ANWAR ZAMSANI
 * AQIL DZARFAN BIN ASRUL SHARAFF
 */

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

class Car {
    private String model;
    private int horsePower;

    public Car() {
    }

    public Car(String model, int horsePower) {
        this.model = model;
        this.horsePower = horsePower;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getInfo() {
        return "Print Car Info:\n" +
                "-".repeat(15) +
                "\nModel - " + model +
                "\nHorse Power - " + horsePower + "\n";
    }
}

class CarFactory {
    Scanner in = new Scanner(System.in);

    public Car buildCar() {
        Car car = new Car();

        System.out.print("Enter model: ");
        car.setModel(in.nextLine());

        System.out.print("Enter Horse Power: ");
        car.setHorsePower(in.nextInt());

        return car;
    }

    public void modifyCar(Car car, String model, int horsePower) {
        car.setModel(model);
        car.setHorsePower(horsePower);
    }
}