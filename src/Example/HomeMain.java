package Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HomeMain {
    public static void main(String[] args) {
        List<Home> homes = new ArrayList<>();

        List<Home> homeExpensive = new ArrayList<>();
        List<Home> homeCheap = new ArrayList<>();

        Home homesAhmadli = new Home(180000,"Ahmadli",14);
        Home homesNarimanov = new Home(240000,"Narimanov",11);
        Home homes28May = new Home(280000,"28 May",5);
        Home homesRazin = new Home(125000,"Razin",9);
        Home homesQaraQarayev = new Home(230000,"Qara Qarayev",10);
        Home homesNizami = new Home(260000,"Nizami",7);
        Home homesKhatai = new Home(198000,"Khatai",3);
        homes.add(homesAhmadli);
        homes.add(homesNarimanov);
        homes.add(homes28May);
        homes.add(homesRazin);
        homes.add(homesQaraQarayev);
        homes.add(homesNizami);
        homes.add(homesKhatai);
        System.out.println(homes);

        for (Home i: homes) {
            if (i.price>200000){
                homeExpensive.add(i);

            }
            else {
                homeCheap.add(i);
            }


        }
        System.out.println(homeExpensive);
        System.out.println(homeCheap);

        Collections.sort(homes, new Comparator<Home>() {
            @Override
            public int compare(Home o1, Home o2) {
                return o1.price-o2.price;
            }
        });
        System.out.println("sorted"+homes);


    }
}
