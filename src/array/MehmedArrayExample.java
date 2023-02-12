package array;

import java.util.Scanner;

public class MehmedArrayExample {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] arry = new int[10];

        for (int i = 0; i<arry.length; i++){
            arry[i] = scanner.nextInt();
        }

        for (int i = 0; i< arry.length; i++){
            if (arry[i]%2!=0){
                System.out.println(arry[i]);
            }

        }

















    }
}
