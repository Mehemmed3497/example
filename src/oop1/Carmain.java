package oop1;

public class Carmain {
    public static void main(String[] args) {
        Car toyota=new Toyota();
        toyota.Star();
        toyota.Stop();
        carTesting(toyota);

        Car bmw=new BMW();
        bmw.Star();
        bmw.Stop();
        carTesting(bmw);
    }

    static void carTesting(Car data){
        System.out.println("Testing is Ok");
    }
}
