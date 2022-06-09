package ss3_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int size = Integer.parseInt(scanner.nextLine());
        int [] arr = new int [size];
        System.out.println("nhap phan tu mang");
        for (int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println( min  + " la so nho nhat");

    }
}
