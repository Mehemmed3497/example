public class Copya5 {
    public static void main(String[] args) {
        int[] arry = {32,13,47,9,78,56};

        for (int i = 0; i < arry.length-1; i++){
            for (int j = 0; j < arry.length-i-1; j++){
                if (arry[j]>arry[j+1]){
                   int bow=arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=bow;

                }
            }
        }


        System.out.println("Sralandiqdan sonra");

        for (int i=0; i < arry.length; i++){
            System.out.println(arry[i]);


        }


    }
}
