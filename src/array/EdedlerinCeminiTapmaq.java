package array;

import java.util.Scanner;

public class EdedlerinCeminiTapmaq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arry = new int[5];

        int cutcem = 0;
        for (int i = 0; i < arry.length; i++){
            arry[i] = scanner.nextInt();
        }
        for (int i = 0; i < arry.length; i++){
            if (arry[i]%2==0)
            cutcem=cutcem+arry[i];
        }
        System.out.println(cutcem);
    }
}
