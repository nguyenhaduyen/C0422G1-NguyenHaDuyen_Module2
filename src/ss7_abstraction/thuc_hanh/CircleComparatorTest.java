package ss7_abstraction.thuc_hanh;

import ss6_Inheritance.thuc_hanh.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles [0] = new Circle(3);
        circles [1] = new Circle(5);
        circles [2] =new Circle(1);
        System.out.println("Truoc khi doi");
        for (Circle circle: circles
             ) {
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("Sau khi doi");
        for (Circle circle: circles
             ) {
            System.out.println(circle);
        }
    }
}
