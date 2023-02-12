package arraytaskyeni;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int[] arry=new int[5];
        arry[0]=45;
        arry[1]=22;
        arry[2]=34;
        arry[3]=17;
        arry[4]=38;
        Arrays.sort(arry);
        int min=arry[0];
        int max=arry[arry.length-1];
        System.out.println(min);
        System.out.println(max);


    }
}
