package array;

import java.util.Scanner;

public class Ededlerieksinecapetmek3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arry = new int[10];

        for (int i = 0; i< arry.length; i++){
            arry[i]= scanner.nextInt();
        }
        System.out.println("ttttttttttttt");

        for (int i = arry.length-1; i>=0; i--){
            System.out.println(arry[i]);
        }
    }
}
