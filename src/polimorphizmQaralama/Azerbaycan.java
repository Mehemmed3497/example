package polimorphizmQaralama;

public class Azerbaycan implements Olkeler{
    @Override
    public void paytaxt() {

        System.out.println("Baki");
    }

    @Override
    public void dini() {
        System.out.println("Islam");

    }

    @Override
    public String deniz() {
        return "Xezer denizi";
    }

    @Override
    public double ehali() {
        return 10.000000 ;
    }

    @Override
    public double erazi() {
        return 286.000;
    }

    @Override
    public String prezident() {
        return "Ilham Eliyev";
    }
}
