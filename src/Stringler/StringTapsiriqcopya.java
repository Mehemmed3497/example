package Stringler;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringTapsiriqcopya {
    public static void main(String[] args) {
//        String cumle = "Men Daqlari ve Meseleri sevirem";
//
//       char[] ch =cumle.toCharArray();
//
//        Arrays.sort(ch);
//        System.out.println(new String(ch).trim());

//        String soz = "Daqlar";
//        boolean bool = soz.startsWith("a");
//        if (bool==true){
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }

//        String metn = "Backend cox maraqli ve mentiqli sahedir sadece cox vaxt ayirmaq lazimdir bu saheye";
//        char[] tap = metn.toCharArray();
//        int saya = 0;
//        int saye = 0;
//        int sayi = 0;
//        for (int i = 0; i < tap.length; i++) {
//          if (tap[i]=='a') {
//            saya++;
//          }
//          if (tap[i]=='e'){
//              saye++;
//          }
//          if (tap[i]=='i'){
//              sayi++;
//          }
//
//        }
//        System.out.println(saya);
//        System.out.println(saye);
//        System.out.println(sayi);

//        String ad = "Renat";
//        char[] ary = ad.toCharArray();
//
//        String d = "";
//        for (int i = ary.length-1; i>=0; i--) {
//         d=d+ary[i];
//
//        }
//        System.out.println(d);

//        String ikisoz = "Alma armud";
//        String[] soz = ikisoz.split(" ");
//        if (soz[0].charAt(soz[0].length()-1)==soz[1].charAt(0)){
//            System.out.println(true);
//
//        }
//        else {
//            System.out.println(false);
//        }
//        String ikisozz = "Sukur Amin";
//        String[] soz = ikisozz.split(" ");
//       char birincisimvol =ikisozz.charAt(ikisozz.length()-1);
//       char ikincisimvol = ikisozz.charAt(1);
//
//       if (birincisimvol==ikincisimvol){
//           System.out.println(true);
//       }
//       else {
//           System.out.println(false);
//       }

//        String soz ="helloasdghellocvbhellorewqhello";
//
//        String lazmsoz = "hello";
//
//        System.out.println(soz.split(lazmsoz,-1).length-1);


//        String str1 = "Red is favorite color.";
//        String str2 = "Orange is also my favorite color.";

//       boolean bool1 = str1.startsWith("Red");
//       boolean bool2 = str2.startsWith("Red");
//
//        System.out.println(str1+bool1);
//        System.out.println(str2+bool2);


//        String ss = "abjkabnmabbankabmab";
//       int say = 0;
//
//        String[] tt = ss.split("ab");
//
//        say=tt.length;
//
//       System.out.println(say);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad soyadi daxil edin");
        String adsoyad = scanner.nextLine();

        String[] massiv = adsoyad.split(" ");
        String soyad=massiv[1];
        System.out.println(soyad);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Adsoyad daxil et");
//        String adsoyad = sc.nextLine();
//
//        int index = adsoyad.indexOf(" ");
//
//        String soyad = adsoyad.substring(index+1);
//
//        System.out.println(soyad);






















    }
}
