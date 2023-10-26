package ch09_Loops.WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

/*
Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop ama adım sayısı değişim değeri
net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlara while loop kullanılır.
 */
//Task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.

        for (int j = 3; j < 21; j++) {
            System.out.print(j + " ");
        }

        System.out.println("\n**********");


        int i = 3;
        while(i <= 20){
            System.out.print(i+" ");
            i++;
        }

        // task02-> 7 kere javaCAN print eden code create ediniz
        System.out.println("   ***   Task02   ***   ");


        int k = 0;
        while(k<=7){
            System.out.println("javaCan");
            k++;
        }

        // task03->2 basamaklı tek sayıları print eden code create ediniz
        System.out.println("   ***   Task03   ***   ");

        int a = 11;
        while(a<100){
            if(a%2==1){
                System.out.print(a+" ");
            }
            a++;
        }

        // task04->bir basamaklı sayma sayılarını aynı satırda print eden code create ediniz
        System.out.println("\n   ***   Task04   ***   ");

        int b = 1;
        while(b<10){
            System.out.print(b+" ");
            b++;
        }

        System.out.println("\n******************");
        int c = 9;
        while(c>0){
            System.out.print(c+" ");
            c--;
        }

        // task05->girilen ifadeyi tersten  print eden code create ediniz
        System.out.println("\n   ***   Task05   ***   ");

        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade giriniz...");
        String str = input.nextLine();

        int harfSayısı = str.length()-1;

        while(harfSayısı>=0){
            System.out.print(str.charAt(harfSayısı));
            harfSayısı--;
        }
        // task06->girilen tamsayıya kadar sayıların toplamını  print eden code create ediniz
         System.out.println("\n   ***   Task06   ***   ");

        Scanner input2 = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz...");
        int sayı = input2.nextInt();
        int y = 0;
        int toplam = 0;

        while(y<=sayı){
            toplam+=y;
            y++;
        }
        System.out.println("toplam = " + toplam);

        // task07->girilen tamsayının faktöriyelini  print eden code create ediniz
        System.out.println("\n   ***   Task07   ***   ");

        Scanner input3 = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz...");
        int num = input.nextInt();
        int fact = 1;

        while (num>0){
            fact *= num;
            num--;
        }
        System.out.println(" factöriyeli = " + fact);


    }

}
