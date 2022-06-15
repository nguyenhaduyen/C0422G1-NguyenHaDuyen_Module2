package ss7_abstraction.bai_tap;

public class Square1 extends Shape implements Corlorable {
    double side;
    public Square1 (){

    }
    public Square1 (double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea () {
        return getSide()*getSide();
    }

    @Override
    public String toString() {
        return "Square1{" +
                "side=" + side +  "area=" + getArea()+
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all 4 sides");
    }
}
