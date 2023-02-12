package old;

import java.util.Scanner;

public class Tttppp {
    public static int fakt(int sayi){
        int faktorial = 1;
        while (faktorial>0){
            faktorial = faktorial*sayi;
            sayi--;

        }
        return faktorial;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        int fff = fakt(sayi);
        System.out.println(fff);


    }
}
