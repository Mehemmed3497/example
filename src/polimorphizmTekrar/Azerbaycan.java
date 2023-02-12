package polimorphizmTekrar;

public class Azerbaycan implements Olke{
    @Override
    public void paytaxt() {
        System.out.println("Baki");
    }

    @Override
    public double erazi() {
        return 286.6;
    }

    @Override
    public String prezident() {
        return "Ilham Eliyev";
    }
}
