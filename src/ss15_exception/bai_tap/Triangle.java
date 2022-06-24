package ss15_exception.bai_tap;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a+b <=c || a+c<=b || c+b <=a) {
       throw new IllegalTriangleException("Tổng 2 cạnh bé hơn cạnh còn lại");
        }
        else if (a < 1 || b < 1 || c <1) {
            throw new IllegalTriangleException(" Cạnh bé hơn 1 ");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
