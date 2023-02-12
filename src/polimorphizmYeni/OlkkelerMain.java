package polimorphizmYeni;

public class OlkkelerMain {
    public static void main(String[] args) {
        Olkeler olkeler=new Azerbaycan();
        Olkeler olkeler1=new Turkiye();


        olkeler.dini();
        olkeler.dili();
        String py= olkeler.paytaxt();
        System.out.println(py);
        String pr= olkeler.prezident();
        System.out.println(pr);
        double eh= olkeler.ehali();
        System.out.println(eh);
    }
}
