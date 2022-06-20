package ss11_stack_queue.bai_tap;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue <String> queue = new ArrayDeque<>();
        System.out.println("Moi nhap tu");
        String word = scanner.nextLine();
        for (int i = 0; i <word.length() ; i++) {
            queue.add(word.charAt(i)+"");
        }
        String [] arr = new String[word.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = queue.poll();
        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==arr[arr.length-1-i]) {
                System.out.println(" Palindrome");
            }
        }
    }
}
