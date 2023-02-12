package listTask;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");
        System.out.println(names.contains("Bob"));
        System.out.println(names.indexOf("Steve"));
        System.out.println(names.lastIndexOf("John"));
        System.out.println(names.lastIndexOf("Ali"));

    }
}
