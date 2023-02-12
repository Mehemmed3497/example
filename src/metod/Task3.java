package metod;

import java.util.Scanner;

public class Task3 {
    public static boolean tassk3(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                return false;
            }


        }
        return true;
    }
    public static int[] fullArr(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("lenght");
        int lenght=scanner.nextInt();
        int[] arr=new int[lenght];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr=Task3.fullArr();
        boolean result=Task3.tassk3(arr);
        System.out.println(result);
    }

}
