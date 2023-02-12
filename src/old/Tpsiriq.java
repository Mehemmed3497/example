package old;

import java.util.Scanner;

public class Tpsiriq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A-ni daxil et");
        int a = sc.nextInt();
        System.out.println("B-ni daxil edin");
        int b = sc.nextInt();
        int sayi = 0;
        int sayi2 = 0;
        for (int i = a; i<=b; i++){
            if (i%2==0){
                sayi++;
            }
            else if (i%2==1) {
                sayi2++;

            }


        }
        System.out.println(sayi);
        System.out.println(sayi2);


    }

}
