package ss7_abstraction.bai_tap;

public class Test2 {
    public static void main(String[] args) {
      Shape [] shapes = new Shape[3];
      shapes [0] = new Square1(2.0);
      shapes [1] = new Rectangle(2.0,3.0);
      shapes [2] = new Circle(5.0);
        for (Shape s: shapes
             ) {
            if (s instanceof Square1) {
                ((Square1)s).howToColor();
            }
            System.out.println(s);
        }




    }
}
