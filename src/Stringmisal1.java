public class Stringmisal1 {
    public static void main(String[] args) {
        String name = "Muhammed";
        System.out.println(name.length());

        char herf = name.charAt(name.length()-1);
        System.out.println(herf);

        String metn = "Qarabaq Azerbaycandirmi";
        boolean m = metn.endsWith("dirmi");
        //System.out.println(m);

        boolean m1 = metn.startsWith("Qara");
        //System.out.println(m1);

        String a = "alma";
        String b = "alma";

        int result = a.compareTo(b);
        //System.out.println(result);
        int result1 = a.compareToIgnoreCase(b);
        //System.out.println(result1);

        boolean c = a.equals(b);
        //System.out.println(c);
        boolean d = a.equalsIgnoreCase(b);
        //System.out.println(d);

        String ad = "Qafqaz Abbasov";
        int index = ad.indexOf("z");
       // System.out.println(index);

    }
}
