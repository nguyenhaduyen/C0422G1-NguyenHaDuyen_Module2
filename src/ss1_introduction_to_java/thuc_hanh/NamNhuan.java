package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Nam: ");
        int year = Integer.parseInt(scanner.nextLine());
        if (year % 4 ==0) {
            if (year % 100 ==0) {
                if (year % 400 == 0) {
                    System.out.printf("%d la nam nhuan", year);
                } else {
                    System.out.printf("%d khong la nam nhuan" , year);
                }
            } else {
                System.out.printf("%d la nam nhuan" , year);
            }
        } else {
            System.out.printf("%d khong phai la nam nhuan" , year);
        }

    }
}
