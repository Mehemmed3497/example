package Example;

import java.util.*;

public class HomeMain2 {
    public static void main(String[] args) {
        List<Home2> list = new ArrayList<>();
        List<Home2> expensivehom=new ArrayList<>();
        List<Home2> cheaphom=new ArrayList<>();
        Home2 list1 = new Home2(110000,"Ahmedli",17);
        Home2 list2 = new Home2(180000,"Nizami",17);
        Home2 list3 = new Home2(160000,"Ganclik",17);
        Home2 list4 = new Home2(210000,"20 Yanvar",17);
        Home2 list5 = new Home2(2600000,"Khatai",17);
        Home2 list6 = new Home2(2300000,"Darnagul",17);
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);
        list.add(list6);
        System.out.println(list);

        for (Home2 c: list) {
            if (c.price>=200000){
              expensivehom.add(c);
            }
            else {
                cheaphom.add(c);
            }

        }
        System.out.println(expensivehom);
        System.out.println(cheaphom);
        Collections.sort(list, new Comparator<Home2>() {
            @Override
            public int compare(Home2 o1, Home2 o2) {
                return o1.price-o2.price;
            }
        });
        System.out.println(list);


    }
}
