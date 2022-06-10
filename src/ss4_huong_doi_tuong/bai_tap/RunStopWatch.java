package ss4_huong_doi_tuong.bai_tap;

import java.util.Arrays;


public class RunStopWatch {
    public static void main(String[] args) {
        int [] arr =new int [1000];
       for (int i =0;i<arr.length;i++) {
           arr[i] = (int)(Math.random());
       }
        System.out.println(Arrays.toString(arr));
       Arrays.sort(arr);
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.getElapsedTime());
    }
}
