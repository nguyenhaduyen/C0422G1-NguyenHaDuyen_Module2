package ss3_mang.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai mang");
        int size = Integer.parseInt(scanner.nextLine());
        int [] arr1 = new int[size];
        for (int i=0;i<arr1.length;i++) {
            System.out.println("nhap ptu");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("nhap gia tri");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i=0;i<arr1.length;i++) {
            if (arr1[i]==num) {
                System.out.println(num + "co trong mang");
                break;
            } else {
                System.out.println("ko co trong mang");
                break;
            }
        }
    }
}
