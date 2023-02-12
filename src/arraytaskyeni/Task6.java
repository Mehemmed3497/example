package arraytaskyeni;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ededleri daxil edin");
        int[] ededler=new int[6];


        for (int i = 0; i <ededler.length ; i++){
            ededler[i] = scanner.nextInt();
        }
        int min=ededler[0];
        int max=ededler[0];

        for (int i = 0; i < ededler.length ; i++) {
            if (ededler[i]<min){
                min=ededler[i];
            }else if (ededler[i]>max){
                max=ededler[i];
            }


        }
        System.out.println(min);
        System.out.println(max);

    }
}
