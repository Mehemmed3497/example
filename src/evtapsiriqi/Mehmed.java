package evtapsiriqi;


import java.util.Random;
import java.util.Scanner;

public class Mehmed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean dogruAdamdir = false;
        int cehdSayi = 0;




        do {

            System.out.println("Zehmet olmsaa login olun!");
            String username = scanner.nextLine();
            String password = scanner.nextLine();

            if (username.equals("admin") && password.equals("12345")) {
                dogruAdamdir = true;
                System.out.println("You are succesfully login!!!");
                System.out.println("1. Yarismaya basla");
                System.out.println("2. Logout");
                System.out.println("3. Exit");
                int secim = scanner.nextInt();
                scanner.nextLine();       //scanner.nextInt()-den sonra  eger bu yazilmasa xeta verir
                if (secim == 1) {
                    System.out.println("Yarismaya baslanicaq");
                    System.out.println("Zehmet olmasa istirakci sayini daxil edin!");
                    int istirakciSayi = scanner.nextInt();
                    scanner.nextLine();   //scanner.nextInt()-den sonra  eger bu yazilmasa xeta verir
                    String[] arr = new String[istirakciSayi];
                    for (int i = 0; i < istirakciSayi; i++) {
                        arr[i] = scanner.nextLine();
                    }
                    System.out.println("Istirakcilarimiz  bunlardir");
                    for (int i = 0; i < istirakciSayi; i++) {
                        System.out.println(arr[i]);
                    }
                    int sistemTerefindenSecilenDeyer = random.nextInt(5) + 1;
                    System.out.println("Sistem terefinden secilen deyer  " + sistemTerefindenSecilenDeyer);
                    int axtarilacaqAdaminNomresi;
                    do {
                        System.out.println("Zehmet olmasa axtarilcaq sexsin nomresini  daxil edin");
                        axtarilacaqAdaminNomresi = scanner.nextInt();

                    } while (sistemTerefindenSecilenDeyer != axtarilacaqAdaminNomresi);  //sistemin verdiyi nomre bizim daxil etdiyimiz nomreye beraber  olmasa proses davam etsin. Yeniden axtaraq

                    System.out.println("Tebrikler dogru  tapdiniz " + arr[axtarilacaqAdaminNomresi - 1]); //axtarilacaqAdaminNomresi  sistemTerefindenSecilenDeyer- e  beraber olarsa yuxaridaki while daki sert
                    // girmediyi ucun bu setre kecid edecek .Bizde hemin adami sout edirik Array-e index vermekle


                }
                else if (secim == 2) {  //burada dogruAdamdir = false;  cehdSayi = 0;  etmekde meqsed prosesin bu serte getmesini temin etmekdir.Cunki bu sert odendiyi muddetce login olmaga calisir
                    dogruAdamdir = false;
                    cehdSayi = 0;
                } else if (secim == 3) { //bu ise proqramdan cixis dir.
//                    return;
                    System.exit(0);
                }

            } else {
                cehdSayi++;  //1  //2   //3
            }
            if (cehdSayi == 3) {
                System.out.println("You banned ");
            }


        } while (dogruAdamdir==false && cehdSayi < 3);


    }

}
