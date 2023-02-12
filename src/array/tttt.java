package array;

import java.util.Scanner;

public class tttt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ESASI DAXIL ET");
        int esas = scanner.nextInt();
        System.out.println("QUVVETI DAXIL ET");
        int quvvet = scanner.nextInt();



        int netice = 1;

        for (int i = 1; i<=quvvet; i++){

            netice=netice*esas;
        }
        System.out.println(netice);
    }
}
