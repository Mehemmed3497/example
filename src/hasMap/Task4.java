package hasMap;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(44,55,66,21,74,88,33,85);
        System.out.println(list);
        List<Integer> cutlist=new ArrayList<>();
        List<Integer> teklist = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0){
                cutlist.add(list.get(i));
            }
            else {
                teklist.add(list.get(i));
            }


        }
        System.out.println(cutlist);
        System.out.println(teklist);

        HashMap<String,List<Integer>> map = new HashMap<>();
        map.put("cut",cutlist);
        map.put("tek",teklist);

        System.out.println("cut---"+map.get("cut"));
        System.out.println("tek---"+map.get("tek"));

    }


}
