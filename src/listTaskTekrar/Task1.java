package listTaskTekrar;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String>animal=new ArrayList<>();
        animal.add("Leon");
        animal.add("Tiger");
        animal.add("Cat");
        animal.add("Dog");
        System.out.println(animal);
        animal.add(2,"Elephant");
        System.out.println(animal);
    }
}
