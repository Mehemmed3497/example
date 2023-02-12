package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Dovsan dovsan = new Dovsan();
        dovsan.setAd("masa");
        dovsan.setMarkov("mar");
        System.out.println(dovsan.ye());

        It it = new It();
        it.setAd("bobiq");
        it.setSumuk("sum");
        System.out.println(it.ye());

        System.out.println(dovsan);
        System.out.println(it);
    }

}
