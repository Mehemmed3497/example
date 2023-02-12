package tekrartask;

public class ArraylarinVurulmasi {
    public static void main(String[] args) {
        int[] a = {5,6,9,11,4,14};
        int[] b = {8,6,4,3,12,4};

        int[] c = new int[a.length];

        for (int i = 0; i < b.length; i++) {
            c[i]=a[i]*b[i];

            System.out.print(c[i]+" ");

        }

    }
}
