package old;

import java.util.Scanner;

public class Tapsiriq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A- ededini daxil et");
        int a = sc.nextInt();
        System.out.println("B - ededin daxil et");
        int b = sc.nextInt();
        int cem = 0;
        int say = 0;
        for (int i = a; i<b; i++){
            if (i%3==0 || i%4==0){
                cem=cem+i;
                say++;

            }

        }
        System.out.println(cem);
        System.out.println(say);
    }
}
