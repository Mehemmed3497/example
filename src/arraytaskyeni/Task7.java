package arraytaskyeni;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ededleri daxil edin");
        int[] ededler=new int[6];
        for (int i = 0; i < ededler.length; i++) {
            ededler[i]= scanner.nextInt();
        }
        Arrays.sort(ededler);
        int min=ededler[0];
        int max=ededler[ededler.length-1];
        System.out.println(min);
        System.out.println(max);


    }
}
