package arraytaskyeni;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Ededi daxil edin");
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= scanner.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Indeksi daxil edin");
        int indeks = scanner.nextInt();
        System.out.println(numbers[indeks]);


    }
}
