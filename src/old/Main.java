package old;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        System.out.println("1-QURU YEMEKLER");
        System.out.println("2-SULU YEMEKLER");
        System.out.println("3- SALATLAR");

        System.out.println("ZEHMET OLMASA SECIM EDIN");
        int a = sc.nextInt();

        if (a == 1) {

            System.out.println("1. as");
            System.out.println("2. dolma");
            int b = sc.nextInt();
            if (b == 1) {
                System.out.println("as");
            }
            else if (b == 2) {
                System.out.println("dolma");
            }
        } else if (a == 2) {
            System.out.println("1.merci");
            System.out.println("2.bors");
            int c = sc.nextInt();
            if (c == 1) {
                System.out.println("merci");
            }
            else if (c == 2) {
                System.out.println("bors");
            }

        } else if (a == 3) {
            System.out.println("1.paytaxt salati");
            System.out.println("2.sezar salati");
            int d = sc.nextInt();
            if (d == 1) {
                System.out.println("paytaxt salati");
            }
            else if (d == 2) {
                System.out.println("sezar salati");

            }

        }
        else {
            System.out.println("BU YEMEKLER MOVCUD DEIL");
        }

    }
}