package ss3_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddNewValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Do dai mang la 10");
        System.out.println("Nhap phan tu vao mang");
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhap so can chen");
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap vi tri index can chen");
        int index = Integer.parseInt(scanner.nextLine());
        if (index<0 || index >arr.length-1) {
                System.out.println("Vi tri khong ton tai");
            } else {
            for (int i= arr.length-1; i>index; i--){
           arr[i] = arr[i-1];
        }
            arr[index]= num;
        }

        System.out.println(Arrays.toString(arr));
    }
}
