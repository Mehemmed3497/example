package polimorphizm;

public class Main {
    public static void main(String[] args) {
        Olkeler olkeler=new Azerbaycan();
//        Olkeler olkeler=new Turkiye();
//        Olkeler olkeler=new Gurcustan();

        olkeler.paytaxt();
        olkeler.dini();
        String deniz= olkeler.deniz();
        System.out.println(deniz);
        double ehali= olkeler.ehali();
        System.out.println(ehali);
        double erazi= olkeler.erazi();
        System.out.println(erazi);
        String olke= olkeler.prezident();
        System.out.println(olke);

    }
}
