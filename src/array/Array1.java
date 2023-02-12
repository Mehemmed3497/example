package array;

public class Array1 {
    public static void main(String[] args) {
        String arr[][][]=new String[10][10][10];

        int a=1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    arr[i][j][k]=a+"   ";
                    a++;
                }

            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(arr[i][j][k]);
                }
                System.out.println();
            }
        }
    }
}
