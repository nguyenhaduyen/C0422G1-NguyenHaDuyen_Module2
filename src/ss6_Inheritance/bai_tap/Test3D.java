package ss6_Inheritance.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Test3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x");
        float x = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap y");
        float y = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap z");
        float z = Float.parseFloat(scanner.nextLine());
        Point3D point3D = new Point3D();
        point3D.setX(x);
        point3D.setY(y);
        point3D.setZ(z);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D.toString());

    }
}
