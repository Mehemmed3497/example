package Stringler;

import java.util.Scanner;

public class AdiTersineYazmaq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("daxil et");
        String ad = sc.nextLine();
        String soz = "";
        for (int i = ad.length()-1; i >=0 ; i--) {
            soz=soz+ad.charAt(i);
            
        }
        System.out.println(soz);
    }
}

    