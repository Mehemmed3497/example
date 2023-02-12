package tekrartask;

public class Sozlerinsayi {
    public static void main(String[] args) {
        String cumle = "Bura azerbaycan respublikasidir";
        String[] massiv = cumle.split(" ");

        int say =0;
        for (int i = 0; i < massiv.length; i++) {
            say++;


        }
        System.out.println(say);


    }
}
