package old;

public class MMNNBB {
    public static int boyuk(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b>a && b>c) {
            return b;
        }else {
            return c;
        }
    }
    public static int boyuk2(int a, int b, int c) {
        int enboyuk;
        if (a > b && a > c) {
            enboyuk=a;
        } else if (b>a && b>c) {
            enboyuk=b;
        }else {
            enboyuk=c;
        }

        return enboyuk;

    }


        public static void main (String[]args){
        int a=boyuk(7, 4, 10);
        int ab =boyuk2(7, 4, 10);
            System.out.println("boyuk=" +a);
            System.out.println("boyuk=" +ab);

        }

    }
