package oop.inheritance;


public class It extends Animal{

    private String sumuk;





    public String getSumuk() {
        return sumuk;
    }

    public void setSumuk(String sumuk) {
        this.sumuk = sumuk;
    }

    @Override
    public String toString() {
        return "It{" +
                "sumuk='" + sumuk + '\'' +
                "} " + super.toString();
    }

}
