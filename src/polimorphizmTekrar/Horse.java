package polimorphizmTekrar;

public class Horse implements Animal{
    @Override
    public void voice() {
        System.out.println("ihahaha");
    }

    @Override
    public String yemek() {
        return "ot";
    }

    @Override
    public String xidmeti() {
        return "yuk ucun";
    }

    @Override
    public int yasi() {
        return 14-17;
    }
}
