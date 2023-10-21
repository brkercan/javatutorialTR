package ch08_Loops.ForLoop.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
// task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz.");
        int sayı1 = input.nextInt();
        System.out.println("ikinci sayıyı giriniz.");
        int sayı2 = input.nextInt();

        for (int i = (sayı1<sayı2 ? sayı1 : sayı2); i < (sayı1>sayı2 ? sayı1 : sayı2); i++){
            System.out.print(i % 2 == 0 ? i+ " " : "");
        }






    }
}
