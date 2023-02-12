package oop.inheritance;

public abstract class Car {
    private int suret;
    private int ili;
    private int qapilar;
    private int motor;
    private String color;
    private String lyuk;

    public int getSuret() {
        return suret;
    }

    public void setSuret(int suret) {
        this.suret = suret;
    }

    public int getIli() {
        return ili;
    }

    public void setIli(int ili) {
        this.ili = ili;
    }

    public int getQapilar() {
        return qapilar;
    }

    public void setQapilar(int qapilar) {
        this.qapilar = qapilar;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLyuk() {
        return lyuk;
    }

    public void setLyuk(String lyuk) {
        this.lyuk = lyuk;
    }

    @Override
    public String toString() {
        return "Car{" +
                "suret=" + suret +
                ", ili=" + ili +
                ", qapilar=" + qapilar +
                ", motor=" + motor +
                ", color='" + color + '\'' +
                ", lyuk='" + lyuk + '\'' +
                '}';
    }
}
