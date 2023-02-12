package array;

public class MehemdArrayExample7 {
    public static void main(String[] args) {
        int[] eded = {8,-32,2,-3,-9,6,11,-13,7};

        int cemmenfi = 0;
        for (int i = 0; i<eded.length; i++){
            if (eded[i] < 0){



                cemmenfi=cemmenfi+eded[i];


            }


        }
        System.out.println(cemmenfi);



    }
}
