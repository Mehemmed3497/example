package polimorphizmTekrar;

public class AnimalMain {
    public static void main(String[] args) {
//        Animal animal=new Doq();
        Animal animal=new Doq();

        animal.voice();
        String xid = animal.xidmeti();
        System.out.println(xid);
        String yem = animal.yemek();
        System.out.println(yem);
        int yas = animal.yasi();
        System.out.println(yas);
    }
}
