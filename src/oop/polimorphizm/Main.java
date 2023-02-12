package oop.polimorphizm;

public class Main {
    public static void main(String[] args) {
  //      Animal animal=new Cat();
//        Animal animal=new Dog();
          Animal animal = new Horse();


        animal.noise();
        String at = animal.eat();
        System.out.println(at);



    }
}
