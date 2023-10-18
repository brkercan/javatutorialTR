package ch07StringManipulation.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 3 adet isim giriniz");
        String fullName = input.nextLine().toUpperCase();

        char ilkAd = fullName.charAt(0);
        char ikinciAd = fullName.substring(fullName.indexOf(" ") + 1).charAt(0);
        char soyAd = fullName.substring(fullName.lastIndexOf(" ")+1).charAt(0);

        System.out.println(ilkAd+"."+ikinciAd+"."+soyAd);






    }
}
