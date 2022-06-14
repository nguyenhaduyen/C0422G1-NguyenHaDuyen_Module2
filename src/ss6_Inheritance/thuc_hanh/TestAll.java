package ss6_Inheritance.thuc_hanh;

import java.util.Scanner;

public class TestAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Nhap ban kinh");
        double radius = Double.parseDouble(scanner.nextLine());
        circle.setRadius(radius);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle("yellow",false,1.0,2.0);
        System.out.println(rectangle.display());
        System.out.println(rectangle.toString());
        Square square = new Square("red",true,2.0);
        System.out.println(square.getArea());
        System.out.println(square.toString());
        }
    }

