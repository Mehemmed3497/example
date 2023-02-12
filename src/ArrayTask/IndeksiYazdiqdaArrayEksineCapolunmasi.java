package ArrayTask;

import java.util.Arrays;

public class IndeksiYazdiqdaArrayEksineCapolunmasi {
    public static void main(String[] args) {
        int[] arry = new int[4];
        arry[0] = 1;
        arry[1] = 2;
        arry[2] = 3;
        arry[3] = 4;
        int[] ery = new int[arry.length];
        int k = 0;
        for (int i = arry.length; i>=0; i--) {
            ery[k]=arry[i];
            k++;

        }
        System.out.println(arry[0]);
    }
}
