package ss11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverse2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i)+"");
        }
        for (int i = 0; i < word.length(); i++) {
            System.out.print(stack.pop());
        }
    }
}
