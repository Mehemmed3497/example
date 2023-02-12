package arraytaskyeni;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[5];
        boolean bool=true;
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scanner.nextInt();

        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                bool=false;

            }


        }
        System.out.println(bool);

    }
}
