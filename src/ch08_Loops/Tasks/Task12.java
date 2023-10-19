package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının print eden code create ediniz
         */

        Scanner input = new Scanner(System.in);

        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("agam ele "+i+". sayıyı giresen : ");
            int sayı = input.nextInt();
            if(sayı<=10 || sayı >=20){
                toplam+=sayı;
            }
        }
        System.out.println("toplam = " + toplam);


    }
}
