package old;

import java.util.Scanner;

public class Baxariq {
    public static int toplamalar (int sayi){
        int faktorial = 1;
        while (sayi>0){
            faktorial = faktorial*sayi;
            sayi--;

        }

        return faktorial;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi= scanner.nextInt();
        int faxt= toplamalar(sayi);
        System.out.println(faxt);




    }
}
