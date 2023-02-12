package Stringler;

import java.util.Arrays;
import java.util.Locale;

public class StringTapsiriq {
    public static void main(String[] args) {
        String name = "Mehemmed Mehdizade";
        //System.out.println(name.length());

//        String[] ad = name.split(" ");
//        System.out.println(ad[1]);
//
//        String sub = name.substring(8);
//        System.out.println(sub.trim());
//
//        String fullname = "Mehemmed Mehdizade Tarlan";
//        String[] full = fullname.split(" ");
//        System.out.println(full[1]);
//
//        String up = fullname.toUpperCase();
//        System.out.println(up);
//
//        String  subb = fullname.substring(8,18);
//        System.out.println(subb.trim());

//        String cumle = "Men Azerbaycan Dovlet Neft ve Senaye Universitetinde Oxumusam";
//        char[] charArray = cumle.toCharArray();
//        Arrays.sort(charArray);
//
//        System.out.println(new String(charArray).trim());
//          String soz = "lazerbaycan";
//         boolean bool= soz.startsWith("a");
//         if (bool==true){
//             System.out.println("yes");
//
//         }else {
//             System.out.println("no");
//
//         }
        String cum = "Qafqaz daqlari";

        char[] ch = cum.toCharArray();
        int saya = 0;
        int saye = 0;
        int sayi = 0;
//        for (int i = 0; i < ch.length; i++) {
//            if (ch[i]=='a'){
//                saya++;
//            }
//            if (ch[i]=='e'){
//               saye++;
//            }
//            if (ch[i]=='i'){
//                sayi++;
//            }
//
//        }
//        System.out.println(saya);
//        System.out.println(saye);
//        System.out.println(sayi);

//        String add = "Ferid";
//        char[] car = add.toCharArray();
//
//        String d = "";
//
//        for (int i = car.length-1; i>=0; i--) {
//            d=d+car[i];
//        }
//        System.out.println(d);

//        String ikisoz = "Quba berde";


//        String[] ss = ikisoz.split(" ");
//        String ilkSoz = ss[0];
//        String ikinciSoz = ss[1];
//        System.out.println(ilkSoz + "     ----------      " + ikinciSoz);
//
//        char sonSimvol = ilkSoz.charAt(ilkSoz.length() - 1);
//        System.out.println(sonSimvol);
//
//        char ilkSimvol = ikinciSoz.charAt(0);
//        System.out.println(ilkSimvol);
//
//        if(sonSimvol==ilkSimvol){
//            System.out.println("=");
//        }else {
//            System.out.println("!=");
//        }


//       String[] array= ikisoz.split(" ");
//
//        if(array[0].charAt(array[0].length()-1)==array[1].charAt(0)){
//            System.out.println("=");
//        }else{
//            System.out.println("!=");
//        }

//        String dd = "ccabffabnnab";
//        String[] sp = dd.split("ab");
//
//        for (int i = 0; i < sp.length; i++) {
//            System.out.println(sp[i]);
//        }
//        System.out.println("ab sayi "+(sp.length-1));

//        String str = "hellofdghhellojhtrhelloll";
//        String findStr = "hello";
//        System.out.println(str.split(findStr,-1).length-1);
//
//
//        System.out.println("------------------");
//
//
//
//        String[] names = { "tom", "bob", "harry" };
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//
//
//        System.out.println("ferid");
//
//        System.out.println("mehmed".toUpperCase());

        String str1 = "Bouk ";
        String str2 = "Qafqaz Daqlari";
        System.out.println(str1);
        System.out.println(str2);
        String str3 = str1.concat(str2);
        System.out.println(str3);


    }
}
