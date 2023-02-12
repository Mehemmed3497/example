package array;

import java.util.Arrays;

public class MehemedArrayExample9 {
    public static void main(String[] args) {
        int[] arry ={12,74,88,2,61,11,};

        Arrays.sort(arry);

        int min = arry[0];
        int max = arry[arry.length-1];

        System.out.println(min);
        System.out.println(max);


    }
}
