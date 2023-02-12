package old;

import java.util.Scanner;

public class Qax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil et");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("Musbet");
        }
        else if (a<0) {
            System.out.println("Menfi");

        }
        else {
            System.out.println("0-dir");
        }


    }
}
