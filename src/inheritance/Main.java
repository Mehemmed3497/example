package inheritance;

public class Main {
    public static void main(String[] args) {
        Toyota toyota=new Toyota();
        toyota.setColor("yasil");
        toyota.setIli(2020);
        toyota.setMotor(2.5);
        toyota.setQapilari("iki");
        System.out.println(toyota);

        BMW bmw=new BMW();
        bmw.setColor("goy");
        bmw.setIli(2021);
        bmw.setMotor(3.5);
        bmw.setQapilari("dord");
        System.out.println(bmw);

    }


}
