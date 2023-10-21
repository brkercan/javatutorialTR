package ch08_Loops.WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop_Task {
    public static void main(String[] args) {

        // task-> girilen tamsayının rakamları toplamını print eden code create ediniz.
        // 2316->6+1+3+2       571622->2+2+6+1+7+5

        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz...");
        int sayı = input.nextInt();
        int toplam = 0;

        while(sayı>0){
            toplam+=sayı%10;
            sayı = sayı/10;
        }
        System.out.println("toplam = " + toplam);


    }
}
