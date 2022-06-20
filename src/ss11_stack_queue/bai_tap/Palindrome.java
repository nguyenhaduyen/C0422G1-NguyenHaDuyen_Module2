package ss11_stack_queue.bai_tap;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new ArrayDeque<>();
        System.out.println("Moi nhap tu");
        String word = scanner.nextLine();
        for (int i = 0; i <word.length() ; i++) {
            queue.add(word.charAt(i)+"");
        }
        String [] arr = new String[word.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = queue.poll();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arr[arr.length-1-i]) {
                System.out.println(" Palindrome ");
            }
        }
    }
}
//        Scanner scanner = new Scanner(System.in);
//        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
//        System.out.println("Nhap chuoi");
//        String word = scanner.nextLine();
//        for (int i =word.length()-1; i>0 ; i--) {
//            arrayDeque.add(word.charAt(i));
//        }
//        String result = "";
//        while (!arrayDeque.isEmpty()){
//           result += arrayDeque.poll();
//        }
//        if (result.equalsIgnoreCase(word)) {
//            System.out.println("palindrome");
//        }
//        else {
//            System.out.println("Not palindrome");
//        }
//    }
//}
