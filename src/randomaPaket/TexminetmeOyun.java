package randomaPaket;

import java.util.Arrays;
import java.util.Scanner;

public class TexminetmeOyun {
    public static void main(String[] args) {
        getGuesses();

    }

    public static void getGuesses() {
        int secretNumber =1+ (int) (Math.random()*10);
        int[] guesses = new int[5];
        System.out.println("Texminin nedir");
        Scanner scanner =new Scanner(System.in);
        guesses[0] = scanner.nextInt();
        guesses[1] = scanner.nextInt();
        guesses[2] = scanner.nextInt();
        guesses[3] = scanner.nextInt();
        guesses[4] = scanner.nextInt();
        System.out.println("gizli nomre :"+secretNumber + " Texminim : "+Arrays.toString(guesses));

    }
}
