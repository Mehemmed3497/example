package listTask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {
        List<String> programlanguages=new ArrayList<>();
        programlanguages.add("C");
        programlanguages.add("C++");
        programlanguages.add("Java");
        programlanguages.add("Kotlin");
        programlanguages.add("Python");
        programlanguages.add("Perl");
        programlanguages.add("Ruby");
        System.out.println(programlanguages);
        programlanguages.remove(3);
        System.out.println(programlanguages);
        programlanguages.remove("Java");
        System.out.println(programlanguages);
        List<String> scriptlanguages=new ArrayList<>();
        scriptlanguages.add("Python");
        scriptlanguages.add("Perl");
        scriptlanguages.add("Ruby");
        programlanguages.removeAll(scriptlanguages);
        System.out.println(programlanguages);
//        programlanguages.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("C");
//            }
//        });
//        System.out.println(programlanguages);
        programlanguages.clear();
        System.out.println(programlanguages);



    }
}
