package oop.polimorphizm;

public class Dog implements Animal{
    @Override
    public void noise() {
        System.out.println("How how");
    }


    @Override
    public String eat() {
        return "Sumuk";
    }
}
