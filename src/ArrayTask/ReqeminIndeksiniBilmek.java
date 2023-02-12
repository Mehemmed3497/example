package ArrayTask;

import java.util.Arrays;
import java.util.Scanner;

public class ReqeminIndeksiniBilmek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reqemi daxil et");

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));


        System.out.println("eded tap");

        int searchingNumber = scanner.nextInt(); //3

       //System.out.println(numbers[searchingNumber]);




        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==searchingNumber){
                System.out.println(i+"  "+numbers[i]);
            }
        }
    }
}
