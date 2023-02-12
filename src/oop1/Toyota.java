package oop1;

public class Toyota extends Car {
    String tPackage;

    @Override
    void Star() {
        System.out.println("Toyota Starting");
    }

    @Override
    void Stop() {
        System.out.println("Toyota Stoping");
    }
}
