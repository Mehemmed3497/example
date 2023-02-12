package Example;

import java.util.Comparator;

public class SortBySpeed implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.speed- o2.speed;
    }
}
