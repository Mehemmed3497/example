package old;

public class Saribas {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
        for (int i = 0; i < 50; i++) {
            if (i % 3 == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i = 0; i < 50; i++) {
            if (i % 6 == 2) {
                System.out.print(i+" ");
            }
        }
    }
}
