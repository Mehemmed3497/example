package metod;

import java.util.Scanner;

public class Task2 {
    public static int task2(int[] arr){
        int cem=0;
        for (int i : arr){
            cem += i;
        }
        return cem;
    }

    public static int[] fullArr(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("lenght");
        int lenght=scanner.nextInt();
        int[] arr=new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Array daxil edin");
            arr[i]=scanner.nextInt();

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr=Task2.fullArr();
        int cem=Task2.task2(arr);
        System.out.println(cem);
    }


}
