package funksiya;

import java.util.Scanner;

public class FunksiyaTassk2 {
    static String musmen(int eded){
        String netice = "";
        if (eded>0){
            netice="musbet";
        }
        else if (eded<0){
            netice="menfi";
        }
        else {
            netice="sifir";
        }
        return netice;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ededi daxil et");
        int eded = scanner.nextInt();
        String cavab =  musmen(eded);
        System.out.println(cavab);
    }
}
