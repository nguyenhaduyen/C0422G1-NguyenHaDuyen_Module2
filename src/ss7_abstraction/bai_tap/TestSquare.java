package ss7_abstraction.bai_tap;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square(2.0);
        System.out.println(square);
        square.resize(20);
        System.out.println(square);
    }
}
