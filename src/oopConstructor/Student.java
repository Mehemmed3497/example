package oopConstructor;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int avg;
    private boolean isactive;

    public Student(int id, String name, String surname, int avg, boolean isactive) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.avg = avg;
        this.isactive = isactive;
    }
    void printData(){
        System.out.println(" id-si "+this.id+" adi "+this.name+" soyadi "+this.surname+" ortalamasi "+this.avg+" aktivliyi "+this.isactive);
    }
}
