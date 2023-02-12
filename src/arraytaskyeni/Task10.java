package arraytaskyeni;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int[] ary=new int[5];
        int cem=0;
        int edediorta=0;
        for (int i = 0; i < ary.length; i++) {
            ary[i]= scanner.nextInt();

        }
        for (int i = 0; i < ary.length; i++) {
            cem=cem+ary[i];
            edediorta=cem/ary.length;

        }
        System.out.println(cem);
        System.out.println(edediorta);
    }
}
