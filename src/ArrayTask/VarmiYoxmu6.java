package ArrayTask;

import java.util.Arrays;
import java.util.Scanner;

public class VarmiYoxmu6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reqemi daxil et");

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));


        System.out.println("Muqayise edilecey ededi daxil et");

        int searchingNumber = scanner.nextInt();  // tapilasi reqm

        boolean bool = false;
        int say = 0;

        for (int j = 0; j < numbers.length; j++){
            if (numbers[j]==searchingNumber){
                bool = true;
                say++;
            }
        }
        System.out.println(bool);
        if(bool==true){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

        if(say==0){
            System.out.println("no");
        }else {
            System.out.println("yes");
        }

        System.out.println(say);


    }
}
