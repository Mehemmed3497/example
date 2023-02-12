package oop.modifiers;

public class Diger {
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.name);//default
        System.out.println(person.age);  //protected
        person.setName("Feride");
        if(person.getName()!=null){
            System.out.println(person.getName());
        }
    }
}
