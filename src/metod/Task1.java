package metod;

import java.util.Scanner;

public class Task1 {
    public static boolean task(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }

            }


        }
        return false;
    }

    public static int[] fullArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lenght : ");
        int lenght = scanner.nextInt();
        int[] arr = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Arraylari daxil edin");
            arr[i] = scanner.nextInt();

        }
        return arr;

    }

}





