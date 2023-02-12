package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayVarmiYoxmu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arry = new int[6];

        for (int i = 0; i < arry.length; i++){
            System.out.println("Reqemi daxil et");
            arry[i]= scanner.nextInt();
        }

        System.out.println(Arrays.toString(arry));

        System.out.println("Rrrreqemi daxil et");

        int eded = scanner.nextInt();

        boolean bool = false;
        int c = 0;


        for (int j = 0; j < arry.length; j++){
            if (arry[j]==eded){
                c++;
                bool = true;
            }
        }

        System.out.println(bool);
        System.out.println(c);

    }
}
