package Stringler;

import java.util.Scanner;

public class Ttttaaapsssiriiiq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ilk sozu daxil edin");
        String ilksoz = sc.nextLine();
        System.out.println("son sozu daxil edin");
        String sonsoz = sc.nextLine();

       char son = ilksoz.charAt(ilksoz.length()-1);
       char evvel = sonsoz.charAt(0);
        System.out.println(son);
        System.out.println(evvel);
        boolean netice = false;
        if (son==evvel){
            netice=true;
        }
        System.out.println(netice);



    }
}
