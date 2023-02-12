package old;

import java.util.Scanner;

public class Renat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. QURU YEMEKLER");
        System.out.println("2. SULU YEMEKLER");
        System.out.println("3. SALATLAR");
        int esas1 = sc.nextInt();
        if (esas1 == 1) {
            System.out.println("1.KARTOF");
            System.out.println("2.DOLMA");
            int esasa = sc.nextInt();
            if (esasa == 1) {
                System.out.println("1.KARTOF");
            }
            else if (esasa == 2) {
                System.out.println("2.DOLMA");
            }
            else {
                System.out.println("menu da bu yoxdur");
            }

        }
        else if (esas1 == 2) {
            System.out.println("1.MERCI");
            System.out.println("2.BORS");
            int esasb = sc.nextInt();
            if (esasb == 1) {
                System.out.println("1.MERCI");
            }
            else if (esasb == 2) {
                System.out.println("2.BORS");
            }
            else {
                System.out.println("menu da bu yoxdur");
            }


        }
        else if (esas1 == 3) {
            System.out.println("1.PAYTAXT");
            System.out.println("1.SEZAR");
            int esasc = sc.nextInt();
            if (esasc == 1) {
                System.out.println("1.PAYTAXT");
            }
            else if (esasc == 2) {
                System.out.println("2.SEZAR");


            }

        }
        else {
            System.out.println("BUNLAR BIZIM MENU DA YOXDUR EZIZ MUSTERI");
        }
    }
}
