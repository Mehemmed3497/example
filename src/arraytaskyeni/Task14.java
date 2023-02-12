package arraytaskyeni;

import java.util.Arrays;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Array lari daxil edin");
        int[] arry=new int[8];
        for (int i = 0; i < arry.length; i++) {
            arry[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(arry));
        System.out.println("ededi daxil edin");
        int eded= scanner.nextInt();
        boolean bool=false;
        int say=0;
        int[] arr=new int[arry.length];

    }
}
