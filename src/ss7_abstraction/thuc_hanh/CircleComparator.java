package ss7_abstraction.thuc_hanh;

import ss6_Inheritance.thuc_hanh.Circle;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class CircleComparator implements Comparator <Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() < o2.getRadius()) return -1;
        else if (o1.getRadius() > o2.getRadius()) return 1;
        else return 0;
    }
}
