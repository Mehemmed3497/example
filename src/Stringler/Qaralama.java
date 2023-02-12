package Stringler;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Qaralama {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String combination = upper+lower+number;
        int leng = 8;
        char[] password = new char[leng];
        Random random = new Random();
        for (int i = 0; i < leng; i++) {
            password[i]=combination.charAt(random.nextInt(combination.length()));


        }
        System.out.println(new String(password));
    }
}
