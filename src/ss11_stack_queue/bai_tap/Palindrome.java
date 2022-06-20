package ss11_stack_queue.bai_tap;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
        System.out.println("Nhap chuoi");
        String word = scanner.nextLine();
        for (int i = word.length() - 1; i > 0; i--) {
            arrayDeque.add(word.charAt(i));
        }
        boolean flag = true;
        String result = "";
        while (!arrayDeque.isEmpty()) {
            result += arrayDeque.poll();
        }
        if (result.equalsIgnoreCase(word)) {
            flag = true;
        } else {
            flag = false;
        }
        if (flag) {
            System.out.println("ok");
        } else System.out.println("not");
    }


}
