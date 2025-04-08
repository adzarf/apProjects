import java.util.Scanner;

public class CarFactory {
    Scanner in = new Scanner(System.in);

    public Car buildCar() {
        Car car = new Car();

        System.out.print("Enter model: ");
        car.setModel(in.nextLine());

        System.out.print("Enter Horse Power: ");
        car.setHorsePower(in.nextInt());

        return car;
    }

    public void modifyCar(Car obj, String model, int horsePower) {
        obj.setModel(model);
        obj.setHorsePower(horsePower);
    }
}