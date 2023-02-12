package Stringler;

import java.util.Locale;

public class Misal1 {
    public static void main(String[] args) {
        String name = "Mehemmed Mehdizade Azerbaycan Dovlet Neft ve Senaye Universitetini oxuyub";
//        String comp = "mehemmed Mehdizade";
//        System.out.println(name.length());
//
//        char herf = name.charAt(5);
//        System.out.println(herf);
//
//        boolean soz = name.endsWith("zade");
//        System.out.println(soz);
//
//        boolean soz1 = name.startsWith("Meh");
//        System.out.println(soz1);
//
//        int cc = name.compareTo(comp);
//        System.out.println(cc);
//        int dd = name.compareToIgnoreCase(comp);
//        System.out.println(dd);
//
//        boolean eq = name.equals(comp);
//        System.out.println(eq);
//        boolean eq1 = name.equalsIgnoreCase(comp);
//        System.out.println(eq1);
//
        int in = name.indexOf('M',1);
        System.out.println(in);
        int in1 = name.lastIndexOf("eh");
        System.out.println(in1);
//
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.trim());

        System.out.println();


    }
}
