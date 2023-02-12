package array;

import java.util.Scanner;

public class MehmedArrayExample5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arry = new int[10];

        for (int i = 0; i< arry.length; i++){
            arry[i] = scanner.nextInt();
        }

        int max = arry[0];
        int min = arry[0];
        for (int i = 0; i<arry.length; i++){
            if (arry[i]<min){
                min=arry[i];

            }
            if (arry[i]>max){
                max=arry[i];
            }
        }
        System.out.println("MAX="+max);
        System.out.println("MIN="+min);
    }
}
