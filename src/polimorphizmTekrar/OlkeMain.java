package polimorphizmTekrar;

public class OlkeMain {
    public static void main(String[] args) {
        Olke olke = new Azerbaycan();
//        Olke olke = new Turkiye();
//        Olke olke = new Rusiya();


        olke.paytaxt();
        System.out.println(olke.erazi());
        System.out.println(olke.prezident());


    }
}
