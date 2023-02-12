package old;

import java.util.Scanner;

public class Cinarli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        int a = sc.nextInt();
        System.out.println("b-ni daxil edin");
        int b = sc.nextInt();
        int cem = 0;
        for (int i = a; i<b; i++){
            cem = cem + i;

        }
        System.out.println(cem);
    }
}
