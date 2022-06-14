package ss6_Inheritance.bai_tap;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0,"Blue",6.0);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}
