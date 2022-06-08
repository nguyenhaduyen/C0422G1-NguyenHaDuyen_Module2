package ss2_vong_lap.thuc_hanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so b");
        int b = Integer.parseInt(scanner.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b==0){
            System.out.println("ko co UCLN");
        }
        while (a!=b){
            if (a>b) {
                a = a - b;
            } else {
                b = b-a;
            }
        }
        System.out.println("UCLN" + a);
    }
}
