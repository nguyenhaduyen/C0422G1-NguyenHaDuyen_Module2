package ss6_Inheritance.bai_tap;

public class Cylinder extends Circle{
    double height;
    public Cylinder () {

    }
    public Cylinder (double radius, String color, double height) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume () {
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}' +  "which is a subclass of" + super.toString();
    }
}
