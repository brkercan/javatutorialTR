package ch09_Loops.ForLoop.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan

        Scanner input = new Scanner(System.in);
        System.out.println("pozitif bir sayı giriniz");
        int sayı = input.nextInt();
        int fakt = 1;

        if (sayı > 0) {
            for (int i = sayı; i > 0; i--) {
                fakt *= i;
            }
            System.out.println(sayı + " ın faktöriyeli = " + fakt);
        }else if (sayı == 0){
            System.out.println("0 ın faktöriyeli 1 dir");
        }else System.out.println("pozitif bir tam sayı giriniz");
    }
}
