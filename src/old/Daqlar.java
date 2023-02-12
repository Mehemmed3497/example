package old;

public class Daqlar {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++ ) {
            for (int j = 0; j < 10; j++) {
                System.out.print("QAX");
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("M");
                System.out.print(" ");


            }
            System.out.println();


        }
        System.out.println();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++ ) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("M");
            }
            System.out.println();
        }
    }
}
