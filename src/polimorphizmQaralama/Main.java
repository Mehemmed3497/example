package polimorphizmQaralama;

public class Main {
    public static void main(String[] args) {
 //       Olkeler olkeler=new Azerbaycan();
//        Olkeler olkeler=new Turkiye();
        Olkeler olkeler=new Gurcustan();

        olkeler.paytaxt();
        olkeler.dini();
       String pr = olkeler.prezident();
        System.out.println(pr);
       String dnz = olkeler.deniz();
        System.out.println(dnz);
       double er = olkeler.erazi();
        System.out.println(er);
       double eh = olkeler.ehali();
        System.out.println(eh);
    }
}
