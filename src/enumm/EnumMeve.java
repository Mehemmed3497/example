package enumm;

public class EnumMeve {
    public enum Meyve{
        Alma,
        Armud,
        Qaysi

    }

    public static void main(String[] args) {
        qiymetYaz(Meyve.Qaysi);

    }
    public static void qiymetYaz(Meyve meyvesecim){
        if (meyvesecim==Meyve.Alma){
            System.out.println("Alma : 2 man");
        }
        else if (meyvesecim==Meyve.Armud){
            System.out.println("Armud : 3 man");
        }
        else if (meyvesecim==Meyve.Qaysi){
            System.out.println("Qaysi : 5 man");
        }

    }
}
