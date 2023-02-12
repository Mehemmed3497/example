package old;

import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        int faktorial = 1;
        while (sayi>0){
            faktorial=faktorial*sayi;
            sayi--;
        }
        System.out.println(faktorial);
    }
}
