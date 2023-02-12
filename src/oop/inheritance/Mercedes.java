package oop.inheritance;

public class Mercedes extends Car {
    private String xaladennik;
    private String motorqizdirici;

    public String getXaladennik() {
        return xaladennik;
    }

    public void setXaladennik(String xaladennik) {
        this.xaladennik = xaladennik;
    }

    public String getMotorqizdirici() {
        return motorqizdirici;
    }

    public void setMotorqizdirici(String motorqizdirici) {
        this.motorqizdirici = motorqizdirici;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "xaladennik='" + xaladennik + '\'' +
                ", motorqizdirici='" + motorqizdirici + '\'' +
                "} " + super.toString();
    }
}
