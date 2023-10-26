package ch09_Loops.DoWhileLoop;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayı;
        int toplam = 0;
        do{
            System.out.println("bir sayı giriniz...");
            sayı = input.nextInt();
            toplam+=sayı;
        }while(sayı!=0);
        System.out.println("toplam = " + toplam);
    }

}
