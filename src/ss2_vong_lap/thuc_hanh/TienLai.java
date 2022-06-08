package ss2_vong_lap.thuc_hanh;

import java.util.Scanner;

public class TienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        System.out.println("nhap so tien gui");
        money = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap so thang gui");
        month = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so lai");
        interestRate = Double.parseDouble(scanner.nextLine());
        double totalInterest = 0;
        for (int i=0 ; i<month;i++) {
            totalInterest = totalInterest + money*((interestRate/100)/12 * month);
        }
        System.out.println("So tien lai la " + totalInterest);
    }
}
