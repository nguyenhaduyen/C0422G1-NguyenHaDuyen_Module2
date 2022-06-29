package ss19_string_regex.thuc_hanh;

import java.util.Scanner;

public class AccountExample {
    private static final String EMAIL_REGEX = "^[_a-z0-9]{6,}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String account ="";
        do {
            System.out.println("Moi nhap account");
           account = scanner.nextLine();
        } while (!account.matches(EMAIL_REGEX));
        System.out.println("account nhap hop le");
    }
}
