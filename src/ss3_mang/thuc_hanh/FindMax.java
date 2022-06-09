package ss3_mang.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai mang");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[size];
        System.out.println("nhap phan tu");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr1));
        int max = arr1[0];
        for (int i = 0;i<arr1.length;i++) {
            if (arr1[i]>max) {
                max = arr1[i];
            }
        }
        System.out.println( max  + "la so lon nhat trong mang");
        }
    }

