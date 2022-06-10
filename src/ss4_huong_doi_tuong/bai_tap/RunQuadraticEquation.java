package ss4_huong_doi_tuong.bai_tap;

import java.util.Scanner;

public class RunQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");
        double a=Double.parseDouble(scanner.nextLine());
        System.out.println("nhap b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap c");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.display());
    }
}
