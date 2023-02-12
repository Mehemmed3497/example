package ArrayTask;

public class EdedleriEksineCapEtmek2 {

    public static void main(String[] args) {
        int[] ededler = new int[5];

        ededler[0] = 45;
        ededler[1] = 34;
        ededler[2] = 62;
        ededler[3] = 8;
        ededler[4] = 23;

        for (int i = ededler.length-1; i>=0; i--){
            System.out.println(ededler[i]);

        }
    }


}
