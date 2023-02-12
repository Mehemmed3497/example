package randomaPaket;

import java.util.Random;

public class QarisiqSifreleme {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String combination = upper+lower+num;
        int len = 8;
        char[] password = new char[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            password[i]=combination.charAt(random.nextInt(combination.length()));

        }
        System.out.println(new String(password));
    }
}
