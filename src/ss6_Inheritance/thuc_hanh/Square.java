package ss6_Inheritance.thuc_hanh;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with {" +
                "side=" + getSide() +
                '}' + "which a class subclass of" + super.toString();
    }
}


