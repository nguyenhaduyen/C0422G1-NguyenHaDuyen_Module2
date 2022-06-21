package ss12_java_collection_framework.bai_tap;

import java.util.*;

public class UperCaseConvertToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> word = new TreeMap<>();
        System.out.println("Nhap chuoi");
        String string = scanner.nextLine();
        string.trim().toLowerCase();
        String [] arr = string.split(" ");
        for (String s: arr
             ) {
            if (!s.equals("")) {
                if (word.containsKey(s)) {
                    word.put(s, word.get(s) + 1);
                } else {
                    word.put(s, 1);
                }
            }
        }
        Set<String> keyList = word.keySet();
        for (String s: keyList
             ) {
            System.out.println(s + "=" + word.get(s));
        }
    }
}
