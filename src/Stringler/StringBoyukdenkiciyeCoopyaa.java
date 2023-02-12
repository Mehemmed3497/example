package Stringler;

import java.util.Arrays;
import java.util.Scanner;

public class StringBoyukdenkiciyeCoopyaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cumleni daxil edin");
        String cumle = sc.nextLine();
        String[] massiv = cumle.split(" ");
        Arrays.sort(massiv);
        for (String ters : massiv){
            System.out.print(ters);
        }


    }
}
