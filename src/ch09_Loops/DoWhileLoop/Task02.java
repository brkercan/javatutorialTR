package ch09_Loops.DoWhileLoop;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri prnt eden code create ediniz


        Scanner input = new Scanner(System.in);
        System.out.println("baslangıc karakter giriniz...");
        char startChar = input.next().charAt(0);
        startChar=(char) (startChar+1);
        System.out.println("bitis karakter giriniz...");
        char endChar = input.next().charAt(0);


        do{
            System.out.print(startChar+" ");
            startChar = (char) (startChar+1);

        }while(startChar<=endChar);


    }
}
