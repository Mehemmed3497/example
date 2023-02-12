package Example;


import java.util.*;

public class CarMain {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        List<Car> carFastSpeed = new ArrayList<>();
        List<Car> carLowSpeed = new ArrayList<>();


        Car car1 = new Car(100, "Toyota", 120);
        Car car2 = new Car(101, "Kia", 115);
        Car car3 = new Car(102, "Bmw", 140);
        Car car4 = new Car(103, "Mercedes", 150);
        Car car5 = new Car(104, "Hundai", 170);
        Car car6 = new Car(105, "Changan", 180);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        System.out.println(cars);


//        Collections.sort(cars, new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o1.speed- o2.speed;
//            }
//        }
//
//        );
Collections.sort(cars,new SortBySpeed());

        System.out.println(" sorted "+cars);

//        for (int i = 0; i < cars.size(); i++) {
//            if (cars.get(i).speed >= 150) {
//                carFastSpeed.add(cars.get(i));
//            } else {
//                carLowSpeed.add(cars.get(i));
//            }
//
//        }

//        for (Car c : cars) {
//            if (c.speed >= 150) {
//                carFastSpeed.add(c);
//            } else {
//                carLowSpeed.add(c);
//            }
//        }


        System.out.println(carFastSpeed);
        System.out.println(carLowSpeed);



    }
}
