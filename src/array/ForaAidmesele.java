package array;

public class ForaAidmesele {
    public static void main(String[] args) {
        String netice = "";
        int c = 0;

        for (int i = 0; i<=5; i++){
            for (int j = 0; j<=i; j++){
                netice=netice+c;
                c++;
            }
            netice=netice+"\n";
        }
        System.out.println(netice);

    }


}
