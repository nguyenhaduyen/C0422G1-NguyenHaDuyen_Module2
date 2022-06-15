package ss7_abstraction.bai_tap;

public class Square extends Rectangle implements Resizeable {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);


    }
    public double getArea() {
        return getWidth()*getLength();
    }

    @Override
    public String toString() {
        return "A Square with {" +
                "side=" + getSide() + "area =" + getArea()+
                '}' + "which a class subclass of" + super.toString();
    }
    @Override
    public void resize(double percent) {
        setSide(getSide()+getSide()*percent/100);
    }
}

