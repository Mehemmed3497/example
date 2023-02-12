package ArrayTask;

import java.util.Arrays;
import java.util.Scanner;

public class EdediTapmaq7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ededi daxil et");

        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Indeksi daxil et");

        int searchingnumber = scanner.nextInt();
        boolean bool = false;
        int say = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==searchingnumber){
                System.out.println(i);
                bool = true;
                say++;
            }
        }
        System.out.println(bool);
        System.out.println(say);
    }
}
