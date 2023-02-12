package listTask;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Mobile> telefonlar=new java.util.ArrayList<>();
        Mobile tel1=new Mobile("ONE PLUS","6T",1100);
        Mobile tel2=new Mobile("Samsung","A30",500);
        Mobile tel3=new Mobile("IPHONE","11",200);

        telefonlar.add(tel1);
        telefonlar.add(tel2);
        telefonlar.add(tel3);

        Mobile tel4=new Mobile("HONOR","REDMI NOTE 7",700);
        telefonlar.add(2,tel4);
//        for (Mobile mob : telefonlar){
//            System.out.println(mob);
//        }
//        System.out.println(telefonlar.size());
//        System.out.println(telefonlar.contains(tel4));
//        System.out.println(telefonlar.indexOf(tel2));
//        System.out.println(telefonlar.isEmpty());
//        System.out.println(telefonlar.get(3));
//          telefonlar.clear();
//        System.out.println(telefonlar.remove(2));
//        for (Mobile mob : telefonlar){
//            System.out.println(mob);
//        }


    }
}
