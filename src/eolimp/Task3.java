package eolimp;

import java.util.Scanner;

public class Task3 {
    public static float maxTap(float x, float y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }

    }

    public static float minTap(float a, float b, float c) {
        if (a <=b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float input1 = scanner.nextFloat();
        float input2 = scanner.nextFloat();
        float input3 = scanner.nextFloat();
        float max1=maxTap(input1, input2);
        float max2=maxTap(input2, input3);
        float cem=input1 + input2 + input3;
        float minNumber = minTap(max1, max2, cem);
        System.out.println(minNumber);

    }
}
