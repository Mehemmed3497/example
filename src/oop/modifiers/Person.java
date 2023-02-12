package oop.modifiers;

public class Person {
     String name;
    private String surname;
    protected String age;


   public void salam(){
        surname="xelilov";
        System.out.println(surname);}

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if(name.length()==6) {
           this.name = name;
       }else{
           System.out.println("Zehemt olmasa 6 simvol daxil edin");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
