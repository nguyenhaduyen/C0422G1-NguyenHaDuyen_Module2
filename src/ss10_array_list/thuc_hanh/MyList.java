package ss10_array_list.thuc_hanh;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY =10;
    private  Object elements[];
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i) {
        if (i>=size || i<0) {
            throw new ArrayIndexOutOfBoundsException("Index " +i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public static void main(String[] args) {
        MyList <Integer> listInteger = new MyList<Integer>();
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(8);
        listInteger.add(3);
        System.out.println("element 3: "+listInteger.get(2));
        System.out.println("element 5: "+listInteger.get(5));
    }

}
