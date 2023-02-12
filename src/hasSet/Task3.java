package hasSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(4);
        set.add(42);
        set.add(62);
        set.add(34);
        set.add(34);
        System.out.println(set);

        List<Integer> list =new ArrayList<>(set);
        System.out.println(list);
        System.out.println(list.get(1));







    }
}
