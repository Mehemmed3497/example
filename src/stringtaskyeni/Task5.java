package stringtaskyeni;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String cumle= scanner.nextLine();
        String soyad= cumle.substring(9,18);
        System.out.println(soyad);
    }
}
