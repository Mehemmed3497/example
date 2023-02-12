package oop1;

import java.util.Locale;

public class StudentGetSet {
    private int id;
    private String name;
    private String surname;
    private int avg;
    private boolean isActive;

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
        this.surname = surname;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = Math.abs(avg);
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

//    @Override
//    public String toString() {
//        return "StudentGetSet{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", avg=" + avg +
//                ", isActive=" + isActive +
//                '}';
//    }

    void printData() {
        System.out.println(" id si " + id + " adi " + name + " soyadi " + surname + " ortalamasi " + avg + " aktivliyi " + isActive);
    }
}
