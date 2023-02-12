package oop.inheritance;

public class Animal {
    private int yas;
    private int ayaq;
    private int goz;
    private String ad;
    private String gozRengi;


    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getAyaq() {
        return ayaq;
    }

    public void setAyaq(int ayaq) {
        this.ayaq = ayaq;
    }

    public int getGoz() {
        return goz;
    }

    public void setGoz(int goz) {
        this.goz = goz;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getGozRengi() {
        return gozRengi;
    }

    public void setGozRengi(String gozRengi) {
        this.gozRengi = gozRengi;
    }


    public String ye(){
       return "yeyirem + mesede yasiyaram";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "yas=" + yas +
                ", ayaq=" + ayaq +
                ", goz=" + goz +
                ", ad='" + ad + '\'' +
                ", gozRengi='" + gozRengi + '\'' +
                '}';
    }
}
