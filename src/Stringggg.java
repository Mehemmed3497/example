import java.util.Scanner;

public class Stringggg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arry = new int[6];

        for (int i = 0; i < arry.length; i++){
            arry[i]= scanner.nextInt();
        }

        int cem = 0;
        int say = 0;
        int edediorta = 0;
        for (int i = 0; i < arry.length; i++){
            cem=cem+arry[i];
            say++;
            edediorta=cem/say;

        }
        System.out.println(edediorta);

    }
}

