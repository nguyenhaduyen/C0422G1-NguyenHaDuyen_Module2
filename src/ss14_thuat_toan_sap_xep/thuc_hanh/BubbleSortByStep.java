package ss14_thuat_toan_sap_xep.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mang truoc khi duoc sap xep la");
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------");
        System.out.println("Mang sau khi duoc sap xep la");
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubbleSort(int [] arr) {
        boolean flag = true; //thuat toan can sap xep
        for (int i = 0; i < arr.length && flag; i++) {
            flag = false;
            for (int j = arr.length-1;i<j;j--) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("Mang k can sap xep");
            }
        }
    }
}
