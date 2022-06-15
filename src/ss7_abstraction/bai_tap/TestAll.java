package ss7_abstraction.bai_tap;

public class TestAll {
    public static void main(String[] args) {
        Shape [] shape = new Shape[3];
        shape [0] = new Circle(2);
        shape [1] = new Rectangle(2,3);
        shape [2] = new Square(4);
        System.out.println("Truoc khi tang");
        for (Shape s: shape
             ) {
            System.out.println(s);
        }

        for (Shape s: shape
             ) {
            if (s instanceof Circle) {
                ((Circle)s).resize(20);
            } else if (s instanceof Rectangle) {
                ((Rectangle)s).resize(50);
            } else {
                ((Square)s).resize(30);
            }
        }
        System.out.println("Sau khi tang");
        for (Shape s: shape
             ) {
            System.out.println(s);
        }
    }
}
