package old;

public class Fooor {
    public static void main(String[] args) {
        int a = 0;
        int sonuncu = 0;
        for (int i = 0; i < 30; i++) {
            a=a+i;

            if (a==28){
                sonuncu = i;
                break;
            }
        }
        System.out.println(sonuncu);

    }
}
