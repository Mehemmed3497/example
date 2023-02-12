package polimorphizmYeni;

public class Azerbaycan implements Olkeler{

    @Override
    public void dini() {
        System.out.println("islam");
    }

    @Override
    public void dili() {
        System.out.println("azeri");
    }

    @Override
    public String paytaxt() {
        return "Baki";
    }

    @Override
    public String prezident() {
        return "Ilham Eliyev";
    }

    @Override
    public double ehali() {
        return 10.000000;
    }
}
