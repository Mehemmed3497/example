package tekrartask;

public class TaskarrayaAid {
    public static void main(String[] args) {
        int[] arry = {4, 7, 8, 5, 2, 6};
        double cem = 0;
        double hasil = 1;
        double say = 0;
        double edediorta = 0;

        for (int i = 0; i < arry.length; i++) {
            cem = cem + arry[i];
            hasil = (hasil * arry[i]);
            say++;
            edediorta = cem / say;



        }
        System.out.println(cem);
        System.out.println(hasil);
        System.out.println(edediorta);
        System.out.println(say);

    }
}
