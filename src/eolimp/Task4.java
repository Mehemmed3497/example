package eolimp;

import java.util.Scanner;

public class Task4 {
    public static int maxTap(int x,int y){
        if (x>y){
            return x;
        }
        else {
            return y;
        }
    }
    public static int minTap(int x,int y){
        if (x<y){
            return x;
        }
        else {
            return y;
        }
    }
    public static int maxTap3Dey(int x,int y,int z){
        if (x>y && x>z){
            return x;
        }
        else if (y>x && y>z){
            return y;
        }
        else {
            return z;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input1=scanner.nextInt();
        int input2=scanner.nextInt();
        int input3=scanner.nextInt();
       int maxNumber=maxTap3Dey(maxTap(input1,input2),minTap(input1,input3),input1*input3);
        System.out.println(maxNumber);

    }
}
