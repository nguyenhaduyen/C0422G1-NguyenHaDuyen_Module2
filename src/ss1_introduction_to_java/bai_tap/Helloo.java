package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Helloo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
