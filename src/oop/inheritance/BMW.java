package oop.inheritance;

public class BMW extends Car{
    private String avtopilot;
    private String turbo;

    public String getAvtopilot() {
        return avtopilot;
    }

    public void setAvtopilot(String avtopilot) {
        this.avtopilot = avtopilot;
    }

    public String getTurbo() {
        return turbo;
    }

    public void setTurbo(String turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "avtopilot='" + avtopilot + '\'' +
                ", turbo='" + turbo + '\'' +
                "} " + super.toString();
    }
}
