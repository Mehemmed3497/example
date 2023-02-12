package arraytaskyeni;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int[] arry=new int[6];
        for (int i = 0; i < arry.length; i++) {
            arry[i]= scanner.nextInt();

        }
        System.out.println(Arrays.toString(arry));
        System.out.println("secdiyiniz ededi daxil edin");
        int eded= scanner.nextInt();
        boolean bool=false;
        int say=0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i]==eded){
                bool=true;
                say++;
            }

        }
        System.out.println(bool);
        System.out.println(say);
    }
}
