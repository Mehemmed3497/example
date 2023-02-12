package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner((System.in));
            int c = 0;
            int a = scanner.nextInt();
            c = 10 / a;


            System.out.println("c=" + c);

        } catch (Exception alma) {
            alma.printStackTrace();
            System.out.println("xeta "+alma);
        }
    }
}
