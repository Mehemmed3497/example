package inheritanceYeni;

public class Main {
    public static void main(String[] args) {
//        Car car=new BMW();
//        car.start();
//        car.stop();
//        carTesting(car);


        Car car1=new Toyota();
        car1.start();
        car1.stop();
        carTesting(car1);

    }
    static void carTesting(Car data){
        System.out.println("Testing is ok");
    }
}
