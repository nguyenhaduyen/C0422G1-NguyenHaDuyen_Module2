package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Car> arrayList = new ArrayList<>();

    public void add() {
        System.out.println("Nhap ten xe");
        String name = scanner.nextLine();
        System.out.println("Nhap mau");
        String color = scanner.nextLine();
        System.out.println("nhap noi san xuat");
        String madeIn = scanner.nextLine();
        System.out.println("Nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gia");
        double price = Double.parseDouble(scanner.nextLine());

        arrayList.add(new Car(name, color, madeIn, id, price));
        display();
    }

    public void display() {
        for (Car c : arrayList
        ) {
            System.out.println(c);
        }
    }

    public void delete() {
        System.out.println("Nhap id can xoa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                arrayList.remove(arrayList.get(i));
                return;
            }
        }
        System.out.println("khong ton tai id");
        display();
    }

    public void edit() {
        System.out.println("Nhap id can sua");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                System.out.println("Nhap ten xe");
                arrayList.get(i).setName(scanner.nextLine());
                System.out.println("Nhap mau");
               arrayList.get(i).setColor(scanner.nextLine());
                System.out.println("nhap noi san xuat");
                arrayList.get(i).setMadeIn(scanner.nextLine());
            }
        }
        display();
    }

    public void search() {
        System.out.println("Nhap ten can search");
        String name = scanner.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(name)) {
                System.out.println("San pham can tim la");
                System.out.println(arrayList.get(i));
            }
        }
    }

    public void sort() {
        Collections.sort(arrayList);
        display();
    }
}
