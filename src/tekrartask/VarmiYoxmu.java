package tekrartask;

import java.util.Arrays;
import java.util.Scanner;

public class VarmiYoxmu {
    public static void main(String[] args) {
        int[] a = {12,55,77,44,8,85};

        boolean bool = false;
        int say = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==8){
                bool=true;
                say++;
            }

        }
        System.out.println(bool);





    }
}
