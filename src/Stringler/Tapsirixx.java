package Stringler;

import java.util.Scanner;

public class Tapsirixx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ilksozu daxil edin");
        String ilksoz = sc.nextLine();
        System.out.println("Sonsozu daxil edin");
        String sonsoz = sc.nextLine();
        boolean netice = false;
        char son = ilksoz.charAt(ilksoz.length()-1);
        char evvel = sonsoz.charAt(0);
        if (son==evvel){
            netice=true;
        }
        else {
            netice=false;
        }
        System.out.println(netice);
    }
}
