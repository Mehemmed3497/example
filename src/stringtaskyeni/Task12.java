package stringtaskyeni;

public class Task12 {
    public static void main(String[] args) {
        String soz="alma";
        char[] mass= soz.toCharArray();
        int cem=0;
        for (int i = 0; i < mass.length; i++) {
            cem=cem+mass[i];

        }
        System.out.println(cem);
    }
}
