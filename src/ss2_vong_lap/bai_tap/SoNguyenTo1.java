package ss2_vong_lap.bai_tap;

import java.util.Scanner;

public class SoNguyenTo1 {
    public static void main(String[] args) {
        int num = 2;
        int uoc =0;
        int count = 0;
        while (num <100) {
            for (int i=2;i<num;i++){
                if (num%i==0) {
                    uoc ++;
                    break;
                }
            }
            if (uoc ==0) {
                System.out.println(num);
                count ++;
            }
            uoc=0;
            num++;
        }
    }
}
