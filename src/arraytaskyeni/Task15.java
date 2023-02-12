package arraytaskyeni;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[5];
        boolean bool=false;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1+i; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    bool=true;
                }

            }

        }
        System.out.println(bool);


    }
}
