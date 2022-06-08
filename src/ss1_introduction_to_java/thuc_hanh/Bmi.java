package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("nhap can nang");
        weight = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap chieu cao");
        height = Double.parseDouble(scanner.nextLine());
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s",bmi,"Interpretation\n");
        if (bmi<18) {
            System.out.printf("%-20.2f%s",bmi,"gay");
        }
        else if (bmi<25.0)
        {
            System.out.printf("%-20.2f%s",bmi,"bth");
        }
        else if (bmi<30.0) {
            System.out.printf("%-20.2f%s",bmi,"qua can");
        } else {
            System.out.printf("%-20.2f%s",bmi,"beo");
        }
    }
}