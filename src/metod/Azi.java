package metod;

public class Azi {
    public static void main(String[] args) {
      int qayidandeyer=max(8,16);
        System.out.println(qayidandeyer);
        int qayidandeyer1=max(78,16);
        System.out.println(qayidandeyer1);
    }

    public  static  int max(int a, int b){
        int c=0;
        if (a>b ){
            c=a;
        }else {
            c=b;
        }

        return c;
    }


}
