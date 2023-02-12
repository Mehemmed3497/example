package array;

import java.util.Scanner;

public class MehmedArrayExample4 {
    public static void main(String[] args) {



        int[] arry = {12, 19, 71, 88, 93, 5, -11, 34};
        int max = arry[0];
        int min = arry[0];
        for (int i = 0; i <arry.length; i++){
            if (arry[i]<min){
                min=arry[i];
            }
            if (arry[i]>max){
                max=arry[i];
            }


        }
        System.out.println(max);
        System.out.println(min);



    }
}
