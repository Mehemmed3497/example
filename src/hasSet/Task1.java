package hasSet;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>();
        set.add(45);
        set.add(34);
        set.add(45);
        set.add(45);
        set.add(62);
        System.out.println(set.size());
    }
}
