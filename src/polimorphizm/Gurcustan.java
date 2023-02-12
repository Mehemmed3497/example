package polimorphizm;

public class Gurcustan implements Olkeler{
    @Override
    public void paytaxt() {
        System.out.println("Tiblisi");
    }

    @Override
    public void dini() {
        System.out.println("Xristian");

    }

    @Override
    public String prezident() {
        return "Salome Zurabisvili";
    }

    @Override
    public double ehali() {
        return 3.729500;
    }

    @Override
    public double erazi() {
        return 69.7;
    }

    @Override
    public String deniz() {
        return "Qara deniz";
    }
}
