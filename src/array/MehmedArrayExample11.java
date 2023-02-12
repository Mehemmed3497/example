package array;

public class MehmedArrayExample11 {
    public static void main(String[] args) {
        int[] arry = {3,6,7,5,7,4,8};

        int teksay = 0;
        int cutsay = 0;

        for (int i = 0; i < arry.length; i++){
            if (arry[i]%2!=0){
                teksay++;

            }
            if (arry[i]%2==0){
                cutsay++;

            }
            System.out.println(arry[i]);



        }


        System.out.println("tekler="+teksay);
        System.out.println("cutler="+cutsay);
    }
}
