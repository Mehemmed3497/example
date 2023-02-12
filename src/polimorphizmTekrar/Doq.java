package polimorphizmTekrar;

public class Doq implements Animal{
    @Override
    public void voice() {
        System.out.println("ham ham");
    }

    @Override
    public String yemek() {
        return "Sumuk";
    }

    @Override
    public String xidmeti() {
        return "heyeti qoruyur";
    }

    @Override
    public int yasi() {
        return 20;
    }
}
