package ss6_Inheritance.thuc_hanh;

public class Circle extends Shape {
    double radius = 1;
    public Circle() {
    }
    public Circle (String color, boolean filled,double radius) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter () {
        return 2*3.14* radius;
    }
    public double getArea () {
        return 3.14*radius*radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius {" +
                "radius=" + radius +
                "which is a subclass of" + super.toString();
    }
}
