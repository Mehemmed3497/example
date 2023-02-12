package tekrartask;

import java.util.Arrays;

public class Bosluqlarinsayi {
    public static void main(String[] args) {
        String cumle = "Bura azerbaycan respublikasidir";
        char[] ary = cumle.toCharArray();
        System.out.println(Arrays.toString(ary));
        char muq = ' ';
        boolean bol = false;
        int say=0;
        for (int i = 0; i < ary.length; i++) {
            if (ary[i]==muq){
                bol=false;
                say++;
            }

        }
        System.out.println(say);

    }
}
