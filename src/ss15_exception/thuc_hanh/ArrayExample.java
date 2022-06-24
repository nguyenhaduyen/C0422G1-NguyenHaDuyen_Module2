package ss15_exception.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phần tử của mảng ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = rd.nextInt();
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer [] arr = arrExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập index ");
        try{
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println("Gía trị của phần tử có chỉ số " + x + "là" + arr[x]);
        } catch (IndexOutOfBoundsException e) {
//            System.out.println("dss" + e.getMessage());
            e.printStackTrace();
        }
    }
}
