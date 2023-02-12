package oop.inheritance;

public class Dovsan extends Animal{

    private String markov;

    public String getMarkov() {

        return markov;
    }

    public void setMarkov(String markov) {

        this.markov = markov;
    }

    @Override
    public String toString() {
        return "Dovsan{" +
                "markov='" + markov + '\'' +
                "} " + super.toString();
    }
}
