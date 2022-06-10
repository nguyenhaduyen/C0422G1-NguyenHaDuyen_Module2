package ss4_huong_doi_tuong.thuc_hanh;

import java.util.Scanner;

public class RunRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap chieu rong");
        double width  = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Hinh chu nhat cua ban " + rectangle.display());
        System.out.println("Dien tich hinh chu nhat la " + rectangle.getArea());
        System.out.println("Chu vi hinh chu nhat la" + rectangle.getPerimeter());
    }
}
