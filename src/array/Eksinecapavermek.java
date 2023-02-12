package array;

public class Eksinecapavermek {
    public static void main(String[] args) {
        int[] arry = {12,51,22,81,79,34};

        int[] arr = new int[arry.length];

        int k = 0;

        for (int i = arry.length-1; i>=0; i--){
            arr[k]=arry[i];
            k++;
        }
        System.out.println(arr[2]);
    }
}
