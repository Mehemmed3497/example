package polimorphizmYeni;

public class Turkiye implements Olkeler{
    @Override
    public void dini() {
        System.out.println("islam");
    }

    @Override
    public void dili() {
        System.out.println("turk");

    }

    @Override
    public String paytaxt() {
        return "Ankara";
    }

    @Override
    public String prezident() {
        return "RecepTayyip Edodaqan";
    }

    @Override
    public double ehali() {
        return 86.000000;
    }
}
