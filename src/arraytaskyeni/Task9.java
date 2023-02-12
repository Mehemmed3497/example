package arraytaskyeni;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int[] ary=new int[5];
        int cem=0;
        for (int i = 0; i < ary.length; i++) {
            ary[i]=scanner.nextInt();

        }
        for (int i = 0; i < ary.length; i++) {
            cem=cem+ary[i];

        }
        System.out.println(cem);


    }
}
