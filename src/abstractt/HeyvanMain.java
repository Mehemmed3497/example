package abstractt;

public class HeyvanMain {
    public static void main(String[] args) {
        Heyvan heyvan = new At();
        Heyvan heyvan1 = new It();

        heyvan.ses();
        System.out.println(heyvan.yasi());
        heyvan1.ses();
        System.out.println(heyvan1.yasi());

    }
}
