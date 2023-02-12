package oop.inheritance;

public class MainCar {
    public static void main(String[] args) {
        Car mercedes = new Mercedes();
        mercedes.setMotor(3);
        mercedes.setColor("aq");
        mercedes.setIli(2020);
        mercedes.setQapilar(4);
        mercedes.setLyuk("var");
        mercedes.setSuret(260);

        Car toyota = new Toyota();
        toyota.setMotor(3);
        toyota.setColor("aq");
        toyota.setIli(2020);
        toyota.setQapilar(4);
        toyota.setLyuk("var");
        toyota.setSuret(260);


    }
}
