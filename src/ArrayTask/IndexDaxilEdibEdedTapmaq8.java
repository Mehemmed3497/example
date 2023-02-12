package ArrayTask;

import java.util.Arrays;
import java.util.Scanner;

public class IndexDaxilEdibEdedTapmaq8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil et");
        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//
//        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Indeksi daxil et");

        int searching = scanner.nextInt();

        System.out.println(numbers[searching]);
    }
}
