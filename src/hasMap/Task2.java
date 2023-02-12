package hasMap;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(4);
//        list.add(8);
//        list.add(11);
//        list.add(5);
//        list.add(16);
//        list.add(17);
//        list.add(45);
//        list.add(50);
        List<Integer> list= Arrays.asList(1,4,8,11,5,16,17,45,50);
        System.out.println(list);

        ArrayList<Integer> tekList=new ArrayList<>();
        ArrayList<Integer> cutList=new ArrayList<>();

        for (Integer c: list) {
            if (c%2==0){
                cutList.add(c);
            }
            else {
                tekList.add(c);
            }

        }
        System.out.println(cutList);
        System.out.println(tekList);

        HashMap<String, List<Integer>> map=new HashMap<>();
        map.put("cut",cutList);
        map.put("tek",tekList);


        System.out.println("cut list<<<<<<<<"+map.get("cut"));
        System.out.println("tek list<<<<<<<<"+map.get("tek"));


    }
}
