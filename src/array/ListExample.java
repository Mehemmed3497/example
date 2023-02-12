package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List list=new ArrayList();


        int arr[]=new int[10];
        arr[0]=5;
        arr[1]=7;
        arr[1]=7;

        int a1=0;
        list=Arrays.asList(arr);



        System.out.println(list);


       list.add(8);
        list.add(2);
        list.add(5);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(20));
        if(list.contains(56)){
            System.out.println("var ");
        }else{
            System.out.println("yox ");
        }

        System.out.println(list.indexOf(1));
    }
}
