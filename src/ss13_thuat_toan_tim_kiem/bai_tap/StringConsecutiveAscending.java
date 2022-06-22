package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class StringConsecutiveAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap chuoi");
        String string = scanner.nextLine();
        LinkedList <Character> list = new LinkedList<>();
        LinkedList <Character> max = new LinkedList<>();
        for (int i = 0; i <string.length() ; i++) {
            if (list.size()>1 && list.getLast()>=string.charAt(i)){
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size()>max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character m: max
             ) {
            System.out.print(m);
        }
    }
}
