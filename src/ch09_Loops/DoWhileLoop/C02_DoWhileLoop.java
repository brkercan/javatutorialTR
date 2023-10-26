package ch09_Loops.DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        // task-> girilen 13 den kucuk ise "olaaa kazandınız :) " değilse saysı girişi isteyen code create ediniz...

        Scanner input = new Scanner(System.in);
        int sayı;

        do{
            System.out.println("bir sayı giriniz...");
            sayı = input.nextInt();
        }while(sayı>=13);

        System.out.println("olaaa kazandınız...");






    }

}
