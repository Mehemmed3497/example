package listTask;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> firstNumber=new ArrayList<>();
        firstNumber.add(5);
        firstNumber.add(1);
        firstNumber.add(7);
        firstNumber.add(9);
        firstNumber.add(3);

        List<Integer> theEndNumber=new ArrayList<>(firstNumber);

        List<Integer> fiveNumber=new ArrayList<>();
        fiveNumber.add(13);
        fiveNumber.add(17);
        fiveNumber.add(19);
        fiveNumber.add(23);
        fiveNumber.add(27);
        theEndNumber.addAll(fiveNumber);
        System.out.println(theEndNumber);

    }
}
