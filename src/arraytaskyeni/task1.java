package arraytaskyeni;

import java.util.Scanner;

public class task1 {
    public static void ortalama(int [] arr){
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total=total+arr[i];
            
        }
        System.out.println((double) total / arr.length);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();

        }

        ortalama(arr);
    }


}
