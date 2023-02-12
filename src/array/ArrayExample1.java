package array;

import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String [] array=new String[5];






        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextLine();
        }





        for (int i = 0; i < array.length; i++) {  //ekrana cixarmaq
            System.out.println(array[i]);
        }


    }
}
