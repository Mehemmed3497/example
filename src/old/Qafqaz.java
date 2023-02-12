package old;

public class Qafqaz {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10; j++) {
                System.out.print("M");
                System.out.print(" ");
            }
            System.out.println();

        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("M");
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8 - i; j++ ) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("M");

            }
            System.out.println();
        }
    }



}
