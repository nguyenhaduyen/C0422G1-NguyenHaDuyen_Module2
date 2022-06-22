package ss13_thuat_toan_tim_kiem.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        System.out.println("Nhap pt");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhap value");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println( binarySearch(arr,value));
    }
        public static int binarySearch(int[] arr, int value){
            int low =0;
            int high = arr.length -1;
            while (high>=low) {
                int mid = (low+high)/2;
                if (value <arr[mid]) {
                    high =mid-1;
                } else if (value == arr[mid])
                    return mid;
                else
                    low=mid +1;
            }
            return  -1;
        }

    }

