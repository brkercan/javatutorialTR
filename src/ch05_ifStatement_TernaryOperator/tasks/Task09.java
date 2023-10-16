package ch05_ifStatement_TernaryOperator.tasks;


import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı = input.nextInt();

        String sonuc = sayı>=0 ? "pozitif" : "negatif";
        System.out.println(sonuc);


    }
}
