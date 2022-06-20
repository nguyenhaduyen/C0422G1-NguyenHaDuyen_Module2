package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap bieu thuc");
        String string = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < string.length(); i++) {// (()))
            if (string.charAt(i) == '(') {
                stack.push(string.charAt(i));
            } else if (string.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    flag = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (!flag) {
            System.out.println("false");
        } else if (stack.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
