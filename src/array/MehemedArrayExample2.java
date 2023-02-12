package array;

import java.util.Scanner;

public class MehemedArrayExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arry = new int[5];
        for (int i = 0; i< arry.length; i++){
            arry[i] = scanner.nextInt();
        }
        int cem = 1;

        for (int i = 0; i< arry.length; i++){
            cem=cem*arry[i];

        }

        System.out.println(cem);

    }
}
