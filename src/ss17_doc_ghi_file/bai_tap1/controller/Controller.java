package ss17_doc_ghi_file.bai_tap1.controller;

import ss17_doc_ghi_file.bai_tap1.service.ProductServiceImpl;

import java.util.Scanner;

public class Controller {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag =true;
        do {
            System.out.println("Menu");
            System.out.println("1.add");
            System.out.println("2.display");
            System.out.println("3.search");
            System.out.println("Moi nhap so");
            int num = Integer.parseInt(scanner.nextLine());
            ProductServiceImpl product = new ProductServiceImpl();
            switch (num) {
                case 1:
                    product.add();
                    break;
                case 2: product.display();
                break;
                case 3: product.searchByCode();
                break;
            }
        } while (flag);

    }
}
