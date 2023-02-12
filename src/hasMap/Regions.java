package hasMap;

import java.util.HashMap;

public class Regions {
    public static void main(String[] args) {
        HashMap<Integer,String> series = new HashMap<>();
        series.put(34,"Gakh");
        series.put(62,"Zaqatala");
        series.put(8,"Balaken");
        series.put(55,"Sheki");
        series.put(null,"Gabala");
        System.out.println(series);
        System.out.println(series.get(34));
        System.out.println(series.containsKey(8));
        System.out.println(series.get(null));
        System.out.println(series.isEmpty());
        System.out.println(series.containsValue("Gabala"));

//        for (Integer key : series.keySet()) {
//            System.out.println(key);
//
//        }
        for (String value:series.values()) {
            System.out.println(value);
        }



    }
}
