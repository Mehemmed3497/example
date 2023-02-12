package randomaPaket;

import java.util.Random;
import java.util.stream.Stream;

public class AlphabeticRandomIntStream {
    public static void main(String[] args) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString);


        System.out.println("*****************");

        Random ran = new Random();

        // generating integer
        int nxt = ran.nextInt();

        // Printing the random Number
        System.out.println
                ("The Randomly generated integer is : " + nxt);



    }
}
