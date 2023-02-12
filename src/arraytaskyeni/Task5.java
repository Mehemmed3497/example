package arraytaskyeni;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Ededleri daxil edin");
        int [] edeler=new int[6];
        for (int i = 0; i < edeler.length; i++) {
            edeler[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(edeler));
        System.out.println("ededi daxil edin");
        int searching = scanner.nextInt();

        boolean bool=false;
        int say=0;
        for (int i = 0; i < edeler.length; i++) {
            if (edeler[i]==searching){
                System.out.println(i);
                bool=true;
                say++;

            }

        }
    }
}
