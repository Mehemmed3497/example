package ArrayTask;

import java.util.Arrays;

public class MinVeMaxSortlaTapmax5 {
    public static void main(String[] args) {
        int[] ededler = new int[5];

        ededler[0] = 34;
        ededler[1] = 55;
        ededler[2] = 8;
        ededler[3] = 62;
        ededler[4] = 36;

        Arrays.sort(ededler);

        int min = ededler[0];
        int max = ededler[ededler.length-1];

        System.out.println(min);
        System.out.println(max);
    }
}
