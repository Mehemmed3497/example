package inheritance;

public class Car {
    private String color;
    private String qapilari;
    private int ili;
    private double motor;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getQapilari() {
        return qapilari;
    }

    public void setQapilari(String qapilari) {
        this.qapilari = qapilari;
    }

    public int getIli() {
        return ili;
    }

    public void setIli(int ili) {
        this.ili = ili;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", qapilari='" + qapilari + '\'' +
                ", ili=" + ili +
                ", motor=" + motor +
                '}';
    }
}
