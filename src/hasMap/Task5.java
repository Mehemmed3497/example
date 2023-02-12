package hasMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> cutlist=new ArrayList<>();
        List<Integer> teklist=new ArrayList<>();
        list.add(45);
        list.add(34);
        list.add(41);
        list.add(62);
        list.add(80);
        list.add(21);
        list.add(33);
        list.add(36);
        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i)%2==0){
//                cutlist.add(i);
//            }
//            else {
//                teklist.add(i);
//            }
//
//        }

        for (Integer key:list) {
            if (key%2==0){
              cutlist.add(key);
            }
            else {
                teklist.add(key);
            }

        }
        System.out.println(cutlist);
        System.out.println(teklist);
        HashMap<String,List<Integer>> map=new HashMap<>();
        map.put("cut",cutlist);
        map.put("tek",teklist);

        System.out.println("cut---"+map.get("cut"));
        System.out.println("tek---"+map.get("tek"));

    }
}
