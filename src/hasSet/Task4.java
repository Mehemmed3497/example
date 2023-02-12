package hasSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(44);
        list.add(11);
        list.add(8);
        list.add(44);
        list.add(44);
        list.add(57);
        list.add(46);
        list.add(57);
        list.add(40);
        System.out.println(list);

        Set<Integer> set=new HashSet<>(list);
        System.out.println(set);
    }
}
