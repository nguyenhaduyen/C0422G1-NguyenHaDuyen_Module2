package ss19_string_regex.thuc_hanh;

import java.util.Scanner;

public class EmailExample {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = "";
        do {
            System.out.println("Moi nhap email");
            email = scanner.nextLine();
        } while (email.matches(EMAIL_REGEX) == false);
        System.out.println("email da dung dinh dang");
    }
}
