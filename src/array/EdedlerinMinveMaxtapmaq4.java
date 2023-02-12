package array;

import java.util.Scanner;

public class EdedlerinMinveMaxtapmaq4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arry = new int[6];




        for (int i = 0; i < arry.length; i++) {
            arry[i] = scanner.nextInt();
        }
        int min = arry[0];
        int max = arry[0];



        for (int i = 0; i < arry.length; i++) {
            if (arry[i] < min) {
                min = arry[i];
            } else if (arry[i] > max) {
                max = arry[i];
            }


        }
        System.out.println(min);
        System.out.println(max);
    }

}
