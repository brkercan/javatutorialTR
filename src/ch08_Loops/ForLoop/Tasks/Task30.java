package ch08_Loops.ForLoop.Tasks;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("bir adet tam sayı giriniz");
        int sayı1 = input.nextInt();
        System.out.println("bir adet tam sayı giriniz");
        int sayı2 = input.nextInt();

        int toplam = 0;


            for (int i= ((sayı1<sayı2) ? sayı1+1 : sayı2+1) ; i<((sayı1>sayı2) ? sayı1 : sayı2) ; i++) {
                toplam+=i;
            }
        System.out.println("toplam = " + toplam);

    }
}
