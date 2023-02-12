package oopGetterSetter;

import java.util.Locale;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int avg;
    private boolean isactive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase(Locale.ROOT);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase(Locale.ROOT);
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg =Math.abs(avg);
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", avg=" + avg +
//                ", isactive=" + isactive +
//                '}';
//    }
}
