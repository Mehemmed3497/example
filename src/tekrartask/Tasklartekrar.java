package tekrartask;

import java.util.Arrays;

public class Tasklartekrar {
    public static void main(String[] args) {
        String cumle = "Bura azerbaycan respublikasidir";
        char[] arry = cumle.toCharArray();
//        for (int i = arry.length-1; i >=0 ; i--) {
//            System.out.print(arry[i]);
//
//        }
        Arrays.sort(arry);
        System.out.println(arry);


    }
}
