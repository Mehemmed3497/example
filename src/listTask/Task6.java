package listTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(13);
        numbers.add(16);
        numbers.add(19);
        numbers.add(18);
        Iterator<Integer> numbersIterator=numbers.iterator();
        while (numbersIterator.hasNext()){
            Integer num = numbersIterator.next();
            if (num%2!=0){
                numbersIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
