package polimorphizmQaralama;

public class Turkiye implements Olkeler{
    @Override
    public void paytaxt() {
        System.out.println("Ankara");
    }

    @Override
    public void dini() {
        System.out.println("Islam");

    }

    @Override
    public String deniz() {
        return "Qara deniz";
    }

    @Override
    public double ehali() {
        return 84.680543;
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
