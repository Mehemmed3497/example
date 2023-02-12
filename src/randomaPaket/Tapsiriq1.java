package randomaPaket;

import java.util.Random;
import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;


        System.out.println(r.nextInt(10));

//        System.out.println("result "+result);
    }


}