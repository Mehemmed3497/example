package polimorphizmTekrar;

public class Turkiye implements Olke{

    @Override
    public void paytaxt() {
        System.out.println("Ankara");

    }

    @Override
    public double erazi() {
        return 783.356;
    }

    @Override
    public String prezident() {
        return "Recep Tayyip Erdoqan";
    }
}
