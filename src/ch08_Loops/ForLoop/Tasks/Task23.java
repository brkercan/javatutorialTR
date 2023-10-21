package ch08_Loops.ForLoop.Tasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

    /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı = input.nextInt();
        int kareToplam = 0;

        for (int i=1; i<=sayı; i++) {
            kareToplam += i*i;
        }
        System.out.println("kareToplam = " + kareToplam);

    }
}
