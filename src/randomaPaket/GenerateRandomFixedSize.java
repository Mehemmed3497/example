package randomaPaket;

import java.util.Random;

public class GenerateRandomFixedSize {
    public static void main(String[] args) {
        int ededsayi=3;
        int m = (int) Math.pow(10, ededsayi - 1);
        int result=m + new Random().nextInt(9 * m);
        System.out.println(result);

    }


}
