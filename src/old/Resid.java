package old;

import java.util.Scanner;

public class Resid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("QURU YEMEKLER");
        System.out.println("SULU YEMEKLER");
        System.out.println("SALATLAR");
        int a = sc.nextInt();

        if (a == 1) {
            System.out.println("1.AS");
            System.out.println("2.KARTOF");
            int b = sc.nextInt();
            if (b == 1) {
                System.out.println("1.AS");
            } else if (b == 2) {
                System.out.println("2.KARTOF");
            }
            System.out.println("BELE QURU YEMEK NOVU YOXDUR");


        }
        else if (a == 2) {
            System.out.println("1.MERCI");
            System.out.println("2.BORS");
            int d = sc.nextInt();
            if (d == 1) {
                System.out.println("1.MERCI");
            }
            else if (d == 2) {
                System.out.println("2.BORS");

            }
            System.out.println("BELE SORBA NOVU YOXDUR");

        }
        else if (a == 3) {
            System.out.println("1.PAYTAXT");
            System.out.println("2.SEZAR");
            int h = sc.nextInt();
            if (h == 1) {
                System.out.println("1.PAYTAXT");

            }
            else if (h == 2) {
                System.out.println("2.SEZAR");

            }
            System.out.println("BELE SALAT NOVU YOXDUR");


        }
        else {
            System.out.println("BUNLAR YOXDUR");
        }
    }
}
