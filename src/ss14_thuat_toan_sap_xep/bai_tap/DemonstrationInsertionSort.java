package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DemonstrationInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int size = Integer.parseInt(scanner.nextLine());
        int [] arr = new int [size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap ptu");
            arr[i] =Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Truoc khi thay doi");
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println("Sau khi thay doi");
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] arr) {
        int pos,x;
        for (int i=1;i< arr.length;i++) {
           pos = i;
           x = arr[i];
            System.out.println(" Tim vi tri dung cho phan tu " + x);
            System.out.println("gan x = " + arr[i]);

           while (pos>0 && x<arr[pos-1]) {
               System.out.println(x + " nho hon " +arr[pos-1]);
               System.out.println(arr[pos-1] + " se ghi de " + arr[pos]);
               arr[pos] = arr[pos-1];
               pos--;
               System.out.println(Arrays.toString(arr));
           }
            System.out.println("gan x = " +x+" cho " + arr[pos]);
           arr[pos] = x;
            System.out.println(Arrays.toString(arr));
        }
    }
}
