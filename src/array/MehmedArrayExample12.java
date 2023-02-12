package array;

public class MehmedArrayExample12 {
    public static void main(String[] args) {
        int arry[][]= new int[3][];
        arry[0]=new int[3];
        arry[1]=new int[3];
        arry[2]=new int[3];

        int say = 0;
        for (int i = 0; i < arry.length; i++)
            for (int j = 0; j <arry[i].length; j++)
                arry[i][j]=say++;



        for (int i = 0; i < arry.length; i++){
            for (int j = 0; j < arry[i].length; j++){
                System.out.print(arry[i][j]+" ");
            }
            System.out.println();

        }
    }
}
