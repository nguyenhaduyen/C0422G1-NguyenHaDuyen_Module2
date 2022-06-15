package ss7_abstraction.bai_tap;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.0,3.0);
        System.out.println(rectangle);
        rectangle.resize(20);
        System.out.println(rectangle);
    }
}
