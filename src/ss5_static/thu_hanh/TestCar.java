package ss5_static.thu_hanh;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("ABC","XYZ");
        car1.display();
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("CDF","XYZ");
        car2.display();
        System.out.println(Car.numberOfCars);
    }
}
