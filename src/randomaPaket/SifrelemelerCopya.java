package randomaPaket;

import java.util.Random;

public class SifrelemelerCopya {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialchars = ",.!@#$%^&*)(-=+/|";
        String comparation = upper+lower+num+specialchars;
        int len = 8;
        char[] password = new char[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            password[i]=comparation.charAt(random.nextInt(comparation.length()));

        }
        System.out.println(new String(password));
    }

}
