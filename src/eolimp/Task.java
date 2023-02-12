package eolimp;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int onluq = input / 10;
        int teklik = input % 10;
        if (input >= 10 && input <= 99) {
            System.out.println(onluq + " " + teklik);
        }
    }

}
