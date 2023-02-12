package hasa;

import java.util.HashSet;
import java.util.Set;


public class Task2 {
    public static void main(String[] args) {
        Set<Integer> a=new HashSet<Integer>();
        a.add(1);
        a.add(3);
        a.add(2);
        a.add(4);
        a.add(8);
        a.add(9);
        a.add(0);
        
        Set<Integer> b = new HashSet<Integer>();
        b.add(1);
        b.add(3);
        b.add(7);
        b.add(5);
        b.add(4);
        b.add(0);
        b.add(7);
        b.add(5);

        Set<Integer> union= new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("bilikde (union)");
        System.out.println(union);

        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("intersection (kesisme)");
        System.out.println(intersection);

        Set<Integer> difference=new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("difference ");
        System.out.println();




    }
}
