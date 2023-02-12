package interfacee;

public class ProsesMain {
    public static void main(String[] args) {
        Toplama toplama = new Proses();
        Cixma cixma = new Proses();
        Vurma vurma = new Proses();
        Cutdumu cutdumu = new Proses();
        System.out.println(toplama.topla(37, 46, 59));
        System.out.println(cixma.cixma(118, 23, 49));
        System.out.println(vurma.vur(14, 3, 6));
        System.out.println(cutdumu.cutdurmuu(77));
    }
}
