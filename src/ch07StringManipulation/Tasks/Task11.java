package ch07StringManipulation.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı print eden code create ediniz
       */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen ad-soyad giriniz");
        String adSoyad = input.nextLine();

        if (adSoyad.contains(" ") && adSoyad.charAt(0) != ' ') {
            System.out.println(adSoyad.substring(0, adSoyad.indexOf(" ")));
            System.out.println(adSoyad.substring((adSoyad.indexOf(" ")+1), adSoyad.length()));
        }else System.out.println("ad-soyad arasına bosluk bırakınız...");



    }
}
