package ss19_string_regex.bai_tap;

import java.util.Scanner;

public class ClassName {
    private static final String CLASS_REGEX = "^[CAP][A-Za-z0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String className ="";
        do {
            System.out.println("moi nhap ten lop");
            className = scanner.nextLine();
        } while (!className.matches(CLASS_REGEX));
        System.out.println("tên lớp nhập đúng định dạng");
    }
}
