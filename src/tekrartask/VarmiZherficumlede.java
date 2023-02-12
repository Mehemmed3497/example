package tekrartask;

import java.util.Arrays;

public class VarmiZherficumlede {
    public static void main(String[] args) {
        String cumle = "Bura azerbaycan respublikasidir zefer";
        char[] arry = cumle.toCharArray();
        int hh = cumle.lastIndexOf('z');
        System.out.println(Arrays.toString(arry));
        char muqayise = 'z';
        boolean bool = false;
        int say = 0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i]==muqayise){
               bool=true;
               say++;
            }

        }
        System.out.println(say);
        System.out.println(hh);

    }


}
