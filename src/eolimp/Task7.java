package eolimp;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arry = new double[6];

        double cutcem = 0;
        for (double i = 0; i < arry.length; i++){
            arry[(int) i] = scanner.nextDouble();
        }
        for (double i = 0; i < arry.length; i++){
            if (arry[(int) i]%3==0 && arry[(int) i]>0) {
                cutcem=cutcem+arry[(int) i];
            }
        }
        System.out.println(cutcem);

    }
}
