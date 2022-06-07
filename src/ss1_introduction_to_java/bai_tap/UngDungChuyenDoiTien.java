package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tien USD can chuyen");
        double num = Double.parseDouble(scanner.nextLine());
        final int rate = 23000;
       double answer = rate*num;
        System.out.println("The total is " + answer);
    }
}
