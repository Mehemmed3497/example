package old;

import java.util.Scanner;

public class KKKmmm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A-ni daxil et");
        int a = sc.nextInt();
        System.out.println("B-ni daxil et");
        int b = sc.nextInt();

        int cutcem = 0;
        int tekcem = 0;

        for (int i = a; i<b; i++){
            if (i%2==0){
                cutcem=cutcem+i;
            }
            else {
                tekcem=tekcem+i;
            }
        }
        System.out.println(cutcem);
        System.out.println(tekcem);
    }
}
