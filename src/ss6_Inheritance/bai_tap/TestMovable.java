package ss6_Inheritance.bai_tap;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2.0f, 3.0f, 5.0f, 7.0f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
