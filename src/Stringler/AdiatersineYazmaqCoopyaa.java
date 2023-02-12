package Stringler;

import java.util.Arrays;
import java.util.Scanner;

public class AdiatersineYazmaqCoopyaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sozu daxil et");
        String soz = sc.nextLine();
        String ters = "";
        for (int i = soz.length()-1; i >=0; i--) {
            ters=ters+soz.charAt(i);


        }
        System.out.println(ters);
    }
}
