package oop.polimorphizm;

public class Cat implements Animal{
    @Override
    public void noise() {
        System.out.println("miaw");
    }

    @Override
    public String eat() {
        return "sican";
    }
}
