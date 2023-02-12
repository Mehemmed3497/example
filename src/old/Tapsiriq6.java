package old;

import java.util.Scanner;

public class Tapsiriq6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int faktorial = 1;
        for (int i = 1; i <=a; i++){
            faktorial=faktorial*i;
        }
        System.out.println(faktorial);
    }
}
