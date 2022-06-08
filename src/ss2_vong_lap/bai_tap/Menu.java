package ss2_vong_lap.bai_tap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        boolean flag = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1.Rectangle");
            System.out.println("2.Print Triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("0.Exit");
            System.out.println("Nhap so chon");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            {
                                System.out.print(" * ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }

                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }

                    for (int i = 0; i < 5; i++) {
                        for (int k = 0; k < i; k++) {
                            System.out.print("   ");
                        }
                        for (int j = 5 - i; j > 0; j--) {
                            System.out.print(" * ");
                        }

                        System.out.println();
                    }
                    for (int i = 5; i > 0; i--) {
                        for (int k = 0; k < i; k++) {
                            System.out.print("   ");
                        }
                        for (int j = 5 - i; j > 0; j--) {
                            System.out.print(" * ");
                        }

                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int k = 5 - i; k > 0; k--) {
                            System.out.print("   ");
                        }
                        for (int j = 0; j < 2 * i - 1; j++) {
                            System.out.print(" * ");

                        }
                        System.out.println();

                    }
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}


