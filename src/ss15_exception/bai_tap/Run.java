package ss15_exception.bai_tap;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = null;
        boolean flag = true;
        do {
            try {
                System.out.println("Nhập a");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập b");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập c");
                double c = Double.parseDouble(scanner.nextLine());
                triangle = new Triangle(a, b, c);
                System.out.println("a,b,c là cạnh tam giác");
                flag = false;
            }catch (NumberFormatException e){
                e.printStackTrace();
                flag = true;
            } catch (IllegalTriangleException e) {
                e.printStackTrace();
                flag = true;
            }
        } while (flag);
        System.out.println(triangle);
    }
}
