package polimorphizmTekrar;

public class Inek implements Heyvan{
    @Override
    public void noice() {
        System.out.println("mooo");
    }

    @Override
    public void istifade() {
        System.out.println("sud qatiq qida ucun");

    }

    @Override
    public void balaAdi() {
        System.out.println("buzov");

    }
}
