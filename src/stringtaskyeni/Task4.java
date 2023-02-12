package stringtaskyeni;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String cumle="Mehemmed Mehdizade Tarlan";
        String[] soyad= cumle.split(" ");
        System.out.println(soyad[1]);
    }
}
