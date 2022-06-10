package ss4_huong_doi_tuong.bai_tap;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDenta() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        return  (-b + Math.sqrt(getDenta())) / (2 * a);
    }

    public double getRoot2() {
        return  (-b - Math.sqrt(getDenta())) / (2 * a);
    }

    public String display() {
        if (getDenta() > 0) {
            return "Phuong trinh co 2 nghiem " + "x1 = " + getRoot1() + "x2 = " + getRoot2();
        } else if (getDenta() == 0) {
           return  "Phuong trinh co nghiem kep x1=x2=" + getRoot2();
        } else {
           return "Phuong trinh vo nghiem";
        }
    }
}

