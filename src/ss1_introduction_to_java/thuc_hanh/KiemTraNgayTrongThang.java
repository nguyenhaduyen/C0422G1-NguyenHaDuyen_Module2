package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban muon kiem tra thang nao");
        int month = Integer.parseInt(scanner.nextLine());
        String dayInMonth;
        switch (month) {
            case 2:
                dayInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30";
                break;
            default:
                dayInMonth = "";
                break;
        }

            if (dayInMonth != "" ) System.out.printf("Thang %d co %s",month,dayInMonth);
        else System.out.print("Ko xac dinh");

    }
}
