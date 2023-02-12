package eolimp;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input= scanner.nextInt();
        int onluq=input/10;
        int teklik=input%10;
        int t=onluq%10;
        int yuzluk=input/100;
        int hasil=yuzluk*teklik*t;
        System.out.println(hasil);

    }
}
