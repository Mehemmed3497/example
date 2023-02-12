package arraytaskyeni;

import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
       int[] arry=new int[5];
       arry[0]=1;
       arry[1]=2;
       arry[2]=3;
       arry[3]=4;
       arry[4]=5;
       int[] arr=new int[arry.length];
       int k=0;
        for (int i = arry.length-1; i>=0; i--) {
            arr[k]=arry[i];
            k++;

        }
        System.out.println(Arrays.toString(arr));




    }
}
