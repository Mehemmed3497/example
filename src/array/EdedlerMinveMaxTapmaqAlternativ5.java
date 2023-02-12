package array;

import java.util.Arrays;

public class EdedlerMinveMaxTapmaqAlternativ5 {
    public static void main(String[] args) {
        int[] ededler = new int[10];

        ededler[0] = 17;
        ededler[1] = 33;
        ededler[2] = 4;
        ededler[3] = 44;
        ededler[4] = 12;
        ededler[5] = 77;
        ededler[6] = 39;
        ededler[7] = 41;
        ededler[8] = 22;
        ededler[9] = 34;

        Arrays.sort(ededler);

        int min = ededler[0];
        int max = ededler[ededler.length-1];

        System.out.println(min);
        System.out.println(max);

    }
}
