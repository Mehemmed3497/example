package Stringler;

import java.util.Scanner;

public class Adsoyad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adsoyadi daxil edin");
        String adsoyad = sc.nextLine();
        int index = adsoyad.indexOf(" ");
        int last = adsoyad.lastIndexOf(" ");
        String soyad = adsoyad.substring(index+1,last);
        System.out.println(soyad);
    }
}
