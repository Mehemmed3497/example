package old;

import java.util.Scanner;

public class Cay {
    public static void main(String[] args) {
        int say = 0;
        int say1 = 0;
        for (int i = 1; i <= 55; i++) {
            if (i % 5 == 0) {
                say++;
            }
            else if(i%11==0){
                say1++;
            }


        }


        System.out.println(say);
        System.out.println(say1);


    }
}
