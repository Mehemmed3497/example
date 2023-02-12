package stringtaskyeni;

public class Task10 {
    public static void main(String[] args) {
        String soz1="Alma";
        String soz2="armud";
        char[] alma= soz1.toCharArray();
        char[] nar=soz2.toCharArray();
        boolean bool=false;
        if (alma[alma.length-1]==nar[0]){
            bool=true;
        }
        else {
            bool=false;
        }
        System.out.println(bool);
    }
}
