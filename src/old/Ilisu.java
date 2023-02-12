package old;

import java.util.Scanner;

public class Ilisu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.QURU YEMEKLER");
        System.out.println("2.SULU YEMEKLER");
        System.out.println("3.SALATLAR");
        System.out.println();
        int menu = sc.nextInt();
        if (menu == 1) {
            System.out.println("1.BASDIRMA");
            System.out.println("2.PURE");
            System.out.println("3.ICALAT");
            int menu1 = sc.nextInt();
            if (menu1 == 1) {
                System.out.println("1.BASDIRMA");
            }
            else if (menu1 == 2) {
                System.out.println("2.PURE");

            }
            else if (menu1 == 3) {
                System.out.println("3.ICALAT");

            }
            else {
                System.out.println("QURU YEMEKLERIN ICERSINDE BU YOXDUR");
            }
        }
        else if (menu == 2) {
            System.out.println("1.MERCI");
            System.out.println("2.KARTOF SORBASI");
            System.out.println("3.VERMESIL SUPU");
            int menu2 = sc.nextInt();
            if (menu2 == 1) {
                System.out.println("1.MERCI");
            }
            else if (menu2 == 2) {
                System.out.println("2.KARTOF SORBASI");

            }
            else if (menu2 == 3) {
                System.out.println("3.VERMESIL SUPU");

            }
            else {
                System.out.println("SULU YEMEKLER ICERSINDE BU YOXDUR");
            }


        } else if (menu == 3) {
            System.out.println("1.SEZAR");
            System.out.println("2.PAYTAXT");
            System.out.println("3.COBAN SALATI");
            int menu3 = sc.nextInt();
            if (menu3 == 1) {
                System.out.println("1.SEZAR");
            }
            else if (menu3 == 2) {
                System.out.println("2.PAYTAXT");

            }
            else if (menu3 == 3) {
                System.out.println("3.COBAN SALATI");

            }
            else {
                System.out.println("SALATLAR ICERISINDE BU YOXDUR");
            }

        }
        else {
            System.out.println("OPSI MENUDA BUNLAR YOXDUR");
        }
    }
}
