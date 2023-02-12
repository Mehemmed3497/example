package array;

import java.util.Scanner;

public class IntArrayExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] array=new int[7];

        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();
        }

        System.out.println("**************************");
        System.out.println("****************gfhjg**********");

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }

    }
}
