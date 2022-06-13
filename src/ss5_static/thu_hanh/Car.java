package ss5_static.thu_hanh;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car (String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars ++;
    }
    void display() {
        System.out.println(name+"\t" + engine);
    }
}
