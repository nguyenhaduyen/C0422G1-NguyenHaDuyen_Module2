package ss17_doc_ghi_file.bai_tap1.service;

import ss17_doc_ghi_file.bai_tap1.model.Product;
import ss17_doc_ghi_file.bai_tap1.util.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements Service {
    static Scanner scanner = new Scanner(System.in);
    final  String PATH_FILE_PRODUCT = "src/ss17_doc_ghi_file/bai_tap/util/product.txt";
    public  void add() {
        List<Product> productList =ReadAndWrite.read(PATH_FILE_PRODUCT);
        System.out.println("Moi nhap ma sp");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten sp");
        String name = scanner.nextLine();
        System.out.println("Hang sx");
        String madeIn = scanner.nextLine();
        System.out.println("nhap gia");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("MO ta khac");
        String othersDescription = scanner.nextLine();
        productList.add(new Product(code, name, madeIn, price, othersDescription));


        ReadAndWrite.write(PATH_FILE_PRODUCT, productList);
    }

    public  void display() {
        List<Product> productList = ReadAndWrite.read(PATH_FILE_PRODUCT);
        for (Product p : productList
        ) {
            System.out.println(p);
        }
    }
    public  void main(String[] args) {
        add();
        display();
        searchByCode();
    }
    public  void searchByCode () {
        System.out.println("Nhap code can tim");
        int code = Integer.parseInt(scanner.nextLine());
        List<Product> productList = ReadAndWrite.read("src/ss17_doc_ghi_file/bai_tap/util/product.txt");
        for (int i = 0; i <productList.size() ; i++) {
            if (code == productList.get(i).getCode()) {
                System.out.println(productList.get(i));
            }
        }
    }
    public static void searchByName() {
        System.out.println("Nhap ten sp can tim");
        String name = scanner.nextLine();
        List<Product> productList = ReadAndWrite.read("src/ss17_doc_ghi_file/bai_tap/util/product.txt");
        for (int i = 0; i < productList.size() ; i++) {
            if (name.equals(productList.get(i).getName())) {
                System.out.println(productList.get(i));
            }
        }
    }
}
