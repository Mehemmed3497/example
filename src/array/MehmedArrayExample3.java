package array;

import java.util.Scanner;

public class MehmedArrayExample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int[] arry = new int[6];
        System.out.println("****************************");
        for (int i = 0; i< arry.length; i++){
            arry[i] = scanner.nextInt();
        }
        System.out.println("________________________________");
        for (int i = 0; i < arry.length; i++){
            System.out.println(arry[arry.length-1-i]);
        }

        System.out.println("+++++++++++++++++++++++++++++++++");

        for (int i = arry.length-1; i>=0; i--){
            System.out.println(arry[i]);
        }




    }
}
