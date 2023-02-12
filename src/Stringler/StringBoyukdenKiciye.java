package Stringler;

import java.util.Arrays;
import java.util.Scanner;

public class StringBoyukdenKiciye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cumleni daxil et");
        String metn = sc.nextLine();
        String[] massiv = metn.split(" ");
        Arrays.sort(massiv);
        for (String met : massiv){
            System.out.println(met);
        }

    }






}
