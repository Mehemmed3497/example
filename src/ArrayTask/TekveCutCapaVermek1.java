package ArrayTask;

public class TekveCutCapaVermek1 {
    public static void main(String[] args) {
        int[] arry = {17, 34, 62, 23, 55, 8};

        int cutcem = 0;
        int tekcem = 0;
        int saycut = 0;
        int saytek = 0;
        int cutvurma = 1;
        int tekvurma = 1;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] % 2 == 0) {
                cutcem = cutcem + arry[i];
                saycut++;
                cutvurma = cutvurma * arry[i];
            } else if (arry[i] % 2 != 0) {
                tekcem = tekcem + arry[i];
                saytek++;
                tekvurma = tekvurma * arry[i];
            }
        }
        System.out.println("Cutlerin cemi="+cutcem);
        System.out.println("Cutlerin sayi="+saycut);
        System.out.println("Cutlerin hasili="+cutvurma);
        System.out.println("Teklerin cemi="+tekcem);
        System.out.println("Teklerin sayi="+saytek);
        System.out.println("Teklerin hasili="+tekvurma);
    }
}
