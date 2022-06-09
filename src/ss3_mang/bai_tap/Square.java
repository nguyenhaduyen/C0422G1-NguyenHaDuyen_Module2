package ss3_mang.bai_tap;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so cot");
        int col = Integer.parseInt(scanner.nextLine());
        int [][] arr = new int [row][col];
        System.out.println("Nhap ptu");
        for (int i=0;i<row;i++) {
            for (int j=0; j<col;j++) {
                arr [i] [j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i=0;i< row; i++) {
            for (int j=0;j<col;j++) {
                System.out.print("Phan tu thu" + i + "-" + j + ":" + arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(sumDiagonalLine(arr));
    }
    public static int sumDiagonalLine (int [] [] arr) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        for (int i=0;i< arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                if (i==j) {
                    sum = sum + arr[i][j];
                }
            }
        }
        return sum;
    }
}
