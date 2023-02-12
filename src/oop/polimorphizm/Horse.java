package oop.polimorphizm;

public class Horse implements Animal{
    @Override
    public void noise() {
        System.out.println("at kisniyir");
    }

    @Override
    public String eat() {
        return  "ot" ;
    }
}
