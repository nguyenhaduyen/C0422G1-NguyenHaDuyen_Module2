package ss14_thuat_toan_sap_xep.thuc_hanh;

import java.util.Arrays;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void main(String[] args) {
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void selectionSort (double[]list) {
        for (int i = 0; i < list.length ; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i+1; j < list.length ; j++) {
               if (list[j] <list[i]) {
                   currentMin = list[j];
                   currentMinIndex = j;
               }
            }
            if (currentMinIndex!=i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
