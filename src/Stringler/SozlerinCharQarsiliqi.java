package Stringler;

import java.util.Arrays;
import java.util.Scanner;

public class SozlerinCharQarsiliqi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sozu daxil et");
        String soz = sc.nextLine();
        String[]  massiv = soz.split(" ");
        Arrays.sort(massiv);
        for (String tersine : massiv){
            System.out.println(tersine);
        }

    }
}
