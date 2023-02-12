package old;

public class RRReee {
    public static void main(String[] args) {
        String a = "";
        for (int i = 0; i<=4; i++){
            for (int j = 0; j<=4-i; j++){
                a=a+"*";
            }
            a=a+"\n";
        }
        System.out.println(a);
    }
}
