package hasMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> meyve=new ArrayList<>();
        meyve.add("Alma");
        meyve.add("Armud");
        meyve.add("Heyva");
        meyve.add("Nar");
        System.out.println(meyve);

        List<String> heyvan=new ArrayList<>();
        heyvan.add("Canavar");
        heyvan.add("Pisik");
        heyvan.add("Aslan");
        heyvan.add("Ayi");
        System.out.println(heyvan);

        List<String> insan=new ArrayList<>();
        insan.add("Ferid");
        insan.add("Resid");
        insan.add("Elsan");
        insan.add("Elnur");
        System.out.println(insan);

        HashMap<String,List<String>> map=new HashMap<>();

        map.put("meyve",meyve);
        map.put("heyvan",heyvan);
        map.put("insan",insan);
        System.out.println(map.get("meyve"));
        System.out.println(map.get("heyvan"));
        System.out.println(map.get("insan"));
    }
}
