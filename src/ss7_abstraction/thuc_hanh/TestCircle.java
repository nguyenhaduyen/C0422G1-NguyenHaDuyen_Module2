package ss7_abstraction.thuc_hanh;

import java.util.Arrays;

public class TestCircle {
    public static void main(String[] args) {
        ComparableCircle [] comparableCircle = new ComparableCircle [3];
        comparableCircle [0] = new ComparableCircle("yellow",true,5);
        comparableCircle [1] = new ComparableCircle("red",false,3);
        comparableCircle [2] =new ComparableCircle("blue",true,4);
        System.out.println("trc khi sap xep");
        for (ComparableCircle circle:comparableCircle
             ) {
            System.out.println(circle);
        }
        Arrays.sort(comparableCircle);
        System.out.println("Sau khi sap xep");
        for (ComparableCircle circle: comparableCircle
             ) {
            System.out.println(circle);
        }
    }
}
