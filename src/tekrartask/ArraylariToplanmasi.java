package tekrartask;

public class ArraylariToplanmasi {
    public static void main(String[] args) {
        int[] a = {62,55,34,23,89,};
        int[] b = {36,8,99,38,42,};

        int[] c = new int[a.length];

        for (int i = 0; i < b.length; i++) {
            c[i]=a[i]+b[i];
            System.out.print(c[i]+" ");

        }
    }
}
