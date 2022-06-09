package ss3_mang.thuc_hanh;

import java.util.Scanner;

public class CelciusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celcius, fahrenheit;
        int choose;
        do {
            System.out.println("Menu");
            System.out.println("1. Chuyen tu C sang F");
            System.out.println("2. Chuyen tu F sang C");
            System.out.println("0. Exit");
            System.out.println("nhap so ban chon");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Nhap do C");
                    celcius = Double.parseDouble(scanner.nextLine());
                    System.out.println("Chuyen tu do F sang do C la" + celciusToFahrenheit(celcius));
                    break;
                case 2:
                    System.out.println("Nhap do F");
                    fahrenheit = Double.parseDouble(scanner.nextLine());
                    System.out.println("Chuyen tu do F sang do C la" + fahrenheitToCelcius(fahrenheit));
                    break;
                case 0:
                    System.exit(0);
            }
        }
        while (choose != 0);
    }

    public static double celciusToFahrenheit(double celcius) {
        double fahrenheit = (9.0 / 5) * celcius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}

