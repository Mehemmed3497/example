package oop.inheritance;

public class Toyota extends Car{
    private String otracaqqizdirici;
    private String ofroad;

    public String getOtracaqqizdirici() {
        return otracaqqizdirici;
    }

    public void setOtracaqqizdirici(String otracaqqizdirici) {
        this.otracaqqizdirici = otracaqqizdirici;
    }

    public String getOfroad() {
        return ofroad;
    }

    public void setOfroad(String ofroad) {
        this.ofroad = ofroad;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "otracaqqizdirici='" + otracaqqizdirici + '\'' +
                ", ofroad='" + ofroad + '\'' +
                "} " + super.toString();
    }
}
