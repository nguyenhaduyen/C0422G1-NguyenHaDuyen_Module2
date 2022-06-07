package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;
public class DienTichHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi rong: ");
        float width = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap chieu cao: ");
        float height = Float.parseFloat(scanner.nextLine());
        float area = width * height;
        System.out.println("Area is " + area);
    }
}
