//package old;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Whiletask {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        Random random=new Random();
//        boolean doqruAdamdir=false;
//        int cehdSayi =0;
//        do {
//            System.out.println("Zehmet olmasa login olun");
//            String username=scanner.nextLine();
//            String password=scanner.nextLine();
//            if (username.equals("admin") && password.equals("12345")){
//                doqruAdamdir=true;
//                System.out.println("You are succesfully login");
//                System.out.println("1.Yarismaya basla");
//                System.out.println("2.Logout");
//                System.out.println("3.Exit");
//                int secim=scanner.nextInt();
//                scanner.nextLine();
//                if (secim==1){
//                    System.out.println("Yarismaya baslanacaq");
//                    System.out.println("Zehmet olmasa istirakci sayini daxil edin");
//                    int istirakciSayi=scanner.nextInt();
//                    scanner.nextLine();
//                    String[] arr=new String[istirakciSayi];
//                    for (int i = 0; i < istirakciSayi; i++) {
//                        arr[i]=scanner.nextLine();
//
//
//                    }
//                    System.out.println("Istirakcilarimiz bunlardir");
//                    for (int i = 0; i < istirakciSayi; i++) {
//                        System.out.println(arr[i]);
//
//                    }
//                    int sistemTerefindenSecilenDeyer=random.nextInt(5)+1;
//                    System.out.println("Sistem terefinden secilen deyer"+sistemTerefindenSecilenDeyer);
//                    int axtarilacaqAdaminNomresi=0;
//                    do {
//                        System.out.println("Zehmet olmasa axtarilacaq adamin nomresini daxil edin");
//                        axtarilacaqAdaminNomresi=scanner.nextInt();
//                    }
//                    while (sistemTerefindenSecilenDeyer!=axtarilacaqAdaminNomresi);
//                }
//
//            }
//        }
//    }
//}
