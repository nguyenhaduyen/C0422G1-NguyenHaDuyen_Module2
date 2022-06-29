package ss19_string_regex.bai_tap;

import java.util.Scanner;

public class TelephoneNumber {
    private static final String PHONE_NUMBER_REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num;
        do {
            System.out.println("Moi nhap so");
            num = scanner.nextLine();
        } while (!num.matches(PHONE_NUMBER_REGEX));
        System.out.println("Dung dinh dang");
    }
}
