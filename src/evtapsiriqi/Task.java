package evtapsiriqi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Login olun");
        System.out.println("Username daxil edin");
        String username = scanner.nextLine();
        System.out.println("Password daxil edin");
        int password = scanner.nextInt();

        if (username.equals("admin") && password == 12345) {
            System.out.println("successufully login");
            System.out.println("Nece nefer istirak edecek");
            int peopleCount = scanner.nextInt();
            scanner.nextLine();
            String[] arr = new String[peopleCount];
            for (int i = 0; i < peopleCount; i++) {
                arr[i] = scanner.nextLine();
            }


            System.out.println("Istifadeciler hakkinda melumat");

            System.out.println("Yarışmada iştirak edən şəxslər uğurla qeydiyyatdan kecdi");
            System.out.println("Novbeti emeliyyati secin");
            System.out.println("1-Yarismaya basla");
            System.out.println("2-Logout");
            System.out.println("3-Exit");
            int process = scanner.nextInt();

            int ran = random.nextInt(5);
            System.out.println(ran);
            System.out.println("Secilen sexsi daxil edin");
            int sec = scanner.nextInt();
            if (sec==ran
            ){
                System.out.println("Congratulations you won!");
            }
            else {
                System.out.println("You failed");
            }



        }

    }
}


/*
      List<String> nameList=new ArrayList<>();
            for (int i = 0; i < peopleCount; i++) {
                nameList.add(scanner.nextLine());
            }
 */