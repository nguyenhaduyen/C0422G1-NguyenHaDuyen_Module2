package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;
public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Given a equation as 'a*x + b = 0', please enter constants");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("b: ");
        double b = Double.parseDouble(scanner.nextLine());
        if (a!=0) {
            double answer = -b/a;
            System.out.printf("Equation pass with x = %f!\n" , answer);
        } else if (b==0) {
                System.out.print("Phuong trinh co vo so nghiem");
            } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
