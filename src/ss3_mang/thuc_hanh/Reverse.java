package ss3_mang.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai mang");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[size] ;


        for (int i=0;i< arr1.length;i++) {
            System.out.println("nhap phan tu cua mang");
             arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr1));
        for (int i =0;i<arr1.length/2;i++) {
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length-1-i];
            arr1[arr1.length-1-i] = temp;
    }
        System.out.println(Arrays.toString(arr1));


    }
}
