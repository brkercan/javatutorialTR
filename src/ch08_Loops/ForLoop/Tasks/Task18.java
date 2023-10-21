package ch08_Loops.ForLoop.Tasks;

import java.util.Scanner;

public class Task18 {

    /*
    task-> Girilen bir tamsayının  3 üssü olup olmadığınıkontrol eden code create ediniz.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı = input.nextInt();

        int count = 0;

        for (int i = 3; i < sayı; i*=3) {
            if(sayı%i != 0) {
                count++;
            }
        }
        System.out.println((count >= 1) ? "3ün üssü (kuvveti) değildir" : "3ün üssü (kuvveti)");


    }
}
