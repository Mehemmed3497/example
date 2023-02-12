package old;

import java.util.Scanner;

public class Daq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ILK EDEDI DAXIL ET");
        int a = sc.nextInt();
        System.out.println("IKINCI EDEDI DAXIL ET");
        int b = sc.nextInt();
        System.out.println("EMELIYYATI SECIN");
        System.out.println("1.TOPLAMA");
        System.out.println("2.CIXMA");
        System.out.println("3.VURMA");
        System.out.println("4.BOLME");
        int em = sc.nextInt();
        if (em == 1) {
            System.out.println(a+"+"+b+"="+(a+b));


        }
        else if (em == 2) {
            System.out.println(a+"-"+b+"="+(a-b));

        }
        else if (em == 3) {
            System.out.println(a+"*"+b+"="+(a*b));

        }
        else if (em == 4) {
            if (b == 0) {
                System.out.println("emeliyyatt sefdir");
            }
            else {
                System.out.println(a + "/" + b + "=" + (a / b));
            }


        }
        else {
            System.out.println("EMELIYYAT SEHVDIR");
        }




    }
}
