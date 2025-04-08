import java.util.Scanner;

public class CarFactory {
    Scanner in = new Scanner(System.in);
    Car car = new Car();

    public void buildCar() {
        System.out.println("Enter model: ");
        car.setModel(in.nextLine());

        System.out.println("Enter Horse Power: ");
        car.setHorsePower(in.nextInt());
    }

    public void modifyCar(Car obj, String model, int horsePower) {
        obj.setModel(model);
        obj.setHorsePower(horsePower);
    }
}