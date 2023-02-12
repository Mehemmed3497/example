package tekrartask;

public class ArraydaIstediyimizReqemVarmi {
    public static void main(String[] args) {
        int[] a = {34,55,62,8,36};


        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"     ");
            if (a[i]==62){
                a[i]=444;


            }

            System.out.println(a[i]+" ");


        }

    }
}
