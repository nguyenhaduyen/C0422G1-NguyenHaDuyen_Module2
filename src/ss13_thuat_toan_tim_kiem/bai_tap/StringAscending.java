package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class StringAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> arrayList = new ArrayList<>();
        System.out.println("Nhap chuoi");
        String string = scanner.nextLine();
        LinkedList <Character> list = new LinkedList<>();
        LinkedList <Character> max = new LinkedList<>();
        for (int i = 0; i <string.length() ; i++) {
            list.add(string.charAt(i));
            for (int j=i+1; j <string.length() ; j++) {
                if (string.charAt(j)>list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (max.size()<list.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character m: max
             ) {
            System.out.print(m);
        }

    }
}

