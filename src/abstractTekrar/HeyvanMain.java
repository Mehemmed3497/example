package abstractTekrar;
public class HeyvanMain {
    public static void main(String[] args) {
        Heyvan heyvan=new At();
        //Heyvan heyvan=new Qartal();

        heyvan.sesi();
        int yas = heyvan.yasi();
        System.out.println(yas);
        String hereket = heyvan.hereketi();
        System.out.println(hereket);
    }
}
