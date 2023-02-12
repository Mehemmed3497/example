package randomaPaket;

import java.util.Random;
import java.util.Scanner;

public class Sifreleme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("reqemi daxil edin");
        int uzunluq = sc.nextInt();
        String cem ="";

        Random random =new Random();
        for (int i = 0; i < uzunluq; i++) {
          int eded =  random.nextInt(10);
          cem=cem+eded;
        }
        System.out.println(cem);
    }
}
