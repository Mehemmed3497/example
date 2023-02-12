package ArrayTask;

public class EdediOrta4 {
    public static void main(String[] args) {
        int[] ededler = new int[5];

        ededler[0] = 34;
        ededler[1] = 36;
        ededler[2] = 55;
        ededler[3] = 62;
        ededler[4] = 7;

        double cem = 0;
        double say = 0;
        double edediorta = 0;

        for (int i = 0; i < ededler.length; i++){
            cem=cem+ededler[i];
            say++;
            edediorta=(cem/say);
        }
        System.out.println(edediorta);


    }
}
