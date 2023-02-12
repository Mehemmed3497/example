package Stringler;

import java.util.Scanner;

public class StringCharinAskiKodlaHesablanmasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sozu daxil edin");
        String soz = sc.nextLine();

        int cem = 0;
        for (int i = 0; i < soz.length(); i++) {
            int kod = soz.charAt(i);
            cem=cem+kod;

        }
        System.out.println(cem);
    }
}
