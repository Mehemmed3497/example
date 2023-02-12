package tekrartask;

import java.util.Arrays;

public class Daxiledilenherflerinsayi {
    public static void main(String[] args) {
        String cumle = "Bura azerbaycan respublikasidir";
        char[] ary = cumle.toCharArray();
        System.out.println(Arrays.toString(ary));
        char muqayise = 'a';
        boolean bool = false;
        int say = 0;

        for (int i = 0; i < ary.length; i++) {
            if (ary[i] == muqayise) {
                bool = true;
                say++;
            }


        }
        System.out.println(say);
        System.out.println(ary.length);
    }
}
