package oop1;

public class StudentConst {
    private int id;
    private String name;
    private String surname;
    private int avg;
    private boolean isActive;

    public StudentConst(int id, String name, String surname, int avg, boolean isActive) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.avg = avg;
        this.isActive = isActive;
    }


    void printData(){
        System.out.println(" id si "+this.id+" adi "+this.name+" soyadi "+this.surname+" ortalamasi "+this.avg+" aktivliyi "+this.isActive);
    }


}
