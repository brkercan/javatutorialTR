package ch11_Arrays;

import java.util.Arrays;

public class C02_ArraysPractice {
    public static void main(String[] args) {

        String isimArr [] = {"Muhammed", "Sebnem", "Musa", "Ayse", "Sennur", "Recep"};
        int sayıArr[] = {20,32,7,58,63,59,35,17,16,21};

        //Task01-> sayıArr cift index elemanlarını print eden code create ediniz

        for (int i = 0; i <sayıArr.length; i++) {
            if(i%2 == 0) {
                System.out.println(i+" inci index eleman: "+ sayıArr[i]);
            }
        }
        System.out.println();
        System.out.println("**** Task 02 *****");
        System.out.println();

        //Task02-> isimArray de 5 karakterden fazla olan elemanları print eden code create ediniz

        for (int i = 0; i< isimArr.length; i++) {
            if(isimArr[i].length()>5) {
                System.out.println(isimArr[i]);
            }
        }

        //Task03-> isimArray de 6 karakterden az olan elemanı saklayan arrayı print eden code create ediniz..
        System.out.println("   ***   task03   ***   ");


        int yeniArrElemanSayısı=0;
        String yeniArr[] = new String[yeniArrElemanSayısı];

        for (int i = 0; i<isimArr.length; i++){
            if(isimArr[i].length()<6){
                yeniArrElemanSayısı++;
                Arrays.fill(yeniArr,isimArr[i]);
                System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));
            }
        }




    }
}
