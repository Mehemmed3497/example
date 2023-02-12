package eolimp;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int yuzluk = input / 100;
        int teklik = input % 10;
        if (input >= 100 && input <= 999) {
            if (yuzluk > teklik) {
                System.out.println(yuzluk);
            } else if (yuzluk < teklik) {
                System.out.println(teklik);
            } else {
                System.out.println("=");
            }
        }
    }
}
