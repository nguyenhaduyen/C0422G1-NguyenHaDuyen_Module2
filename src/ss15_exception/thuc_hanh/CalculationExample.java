package ss15_exception.thuc_hanh;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập x");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập y");
        int y = Integer.parseInt(scanner.nextLine());
        calculation(x,y);

    }
    public static void calculation(int x, int y) {
        try {
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("Tổng của x và y là " + a);
            System.out.println("Hiệu của x và y là " + b);
            System.out.println("Tích của x và y là " + c);
            System.out.println("Thương của x và y là " + d);
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ " + e.getMessage());
        }
    }
}
