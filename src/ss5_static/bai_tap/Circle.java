package ss5_static.bai_tap;

public class Circle {
    private double radius = 1;
    private String color = "red";
    public Circle () {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*3.14;
    }
    void display() {
        System.out.println(getArea());
    }
}
