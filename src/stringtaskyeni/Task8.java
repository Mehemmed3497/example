package stringtaskyeni;

public class Task8 {
    public static void main(String[] args) {
        String cumle="Men Qax rayonu Almali kendinden anadan olmusam biz Qafqaz daqlarinin eteyinde yasayiriq";
        char[] ary = cumle.toCharArray();
        int saya=0;
        int saye=0;
        int sayi=0;
        for (int i = 0; i < ary.length; i++) {
            if (ary[i]=='a'){
             saya++;

            }
            if (ary[i]=='e'){
                saye++;
            }
            if (ary[i]=='i'){
                sayi++;
            }

        }
        System.out.println("a-nin sayi="+saya);
        System.out.println("e-nin sayi="+saye);
        System.out.println("i-nin sayi="+sayi);
    }
}
