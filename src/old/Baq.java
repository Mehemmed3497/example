package old;

import java.util.Scanner;

public class Baq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bali daxil et");
        int a = sc.nextInt();
        if (a>=0 && a<=50 ){
            System.out.println("F");
        }
        else if (a>=51 && a<=60) {
            System.out.println("E");

        }
        else if (a>=61 && a<=70) {
            System.out.println("D");

        }
        else if (a>=71 && a<=80) {
            System.out.println("C");

        }
        else if (a>=81 && a<=90) {
            System.out.println("B");

        }
        else if (a>=91 && a<=100) {
            System.out.println("A");

        }
        else {
            System.out.println("Bu bal yoxdur");
        }


    }
}
