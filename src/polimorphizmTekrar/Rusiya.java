package polimorphizmTekrar;

public class Rusiya implements Olke{
    @Override
    public void paytaxt() {
        System.out.println("Moskva");
    }

    @Override
    public double erazi() {
        return 17.075400;
    }

    @Override
    public String prezident() {
        return "Vladimir Putin";
    }
}
