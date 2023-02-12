package tekrartask;

public class MinMaxTapmax {
    public static void main(String[] args) {
        int[] arry = {12,62,34,55,8,23};

        int min = arry[0];
        int max = arry[0];
        for (int i = 0; i < arry.length; i++) {
            if (arry[i]<min){
                min=arry[i];
            }
            if (arry[i]>max){
                max=arry[i];
            }

        }
        System.out.println(min);
        System.out.println(max);



    }
}
