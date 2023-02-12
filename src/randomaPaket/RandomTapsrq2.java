package randomaPaket;

import java.util.Random;
import java.util.Scanner;

public class RandomTapsrq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil et");
        int uzunluq = sc.nextInt();
        String sifre = "";
        Random random = new Random();
        for (int i = 0; i < uzunluq; i++) {
            int eded = random.nextInt(10);
            sifre=sifre+eded;

        }
        System.out.println(sifre);

    }
}
