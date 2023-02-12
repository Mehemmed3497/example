package metod;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int avg;
    private boolean isActive;
    private String school;

    public Student(int id, String name, String surname, int avg, boolean isActive, String school) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.avg = avg;
        this.isActive = isActive;
        this.school = school;
    }

    public Student(int id, String name, int avg) {
//        this.id = id;
//        this.name = name;
//        this.avg = avg;
        this(56,"dfghjk","f",avg,true,"alma");
    }

    public Student(int id, String name, String surname, int avg, boolean isActive) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.avg = avg;
        this.isActive = isActive;
    }

    public Student() {
    }

    void printData(){

            System.out.println(" id si "+ this.id+" adi "+this.name+" soyadi "+this.surname+" ortalama "+this.avg+" aktivliyi "+this.isActive+" mektebi "+this.school);


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id<10){
            this.id = id;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
