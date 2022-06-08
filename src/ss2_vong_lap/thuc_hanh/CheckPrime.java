package ss2_vong_lap.thuc_hanh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check Prime");
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 2) {
            System.out.println(" so do ko phai la snt");
        }
        else {
            int i = 2;
            int uoc =0;
            for (i=2;i<num;i++) {
                if (num % i ==0) {
                    uoc ++;
                    System.out.println("ko phai so nt");
                    break;
                }
            }
            if (uoc==0){
                System.out.println("so do la so nt");
            }
        }
    }
}
