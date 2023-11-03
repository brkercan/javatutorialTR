package ch11_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        /**
Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.
Array tanımlamak için:
1- data type (Bir array'in icerisinde sadece ayni data tipinden variable olmalıdır.)
2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den  fazla eleman  koyulursa RTE verir)

 Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */

        //Array declaration

        int a; // declare edilen ancak assignment edilmeyen primitive ilkel variable
        int arr[]; // declare edilen ancak assignment edilmeyen non-primitive int data type array

        // Trick -> tanımlanan ancak atanmayan bir array herhangi bir action'a alınırsa CTE verir

        String isimArr [] = {"Muhammed", "Sebnem", "Musa", "Ayse", "Sennur", "Recep"};// hem declare edilen hem de assign edilen

        int sayıArr [] = new int[5]; // eleman sayısı declare edilmiş bos int data type array

        // Array'e eleman girişi->update

        sayıArr[3] =61; // 3. index eleman 61 olarak update edildi
        sayıArr[4] =54;
        sayıArr[0] = 42;

        sayıArr[3] = 54;

        // Array eleman sayısı --> length
        System.out.println("isimArr.length = " + isimArr.length);

        System.out.println("sayıArr.length = " + sayıArr.length);

        // Array print etme...
        System.out.println("sayıArr = " + sayıArr); // sayıArr = [I@246ae04d
        System.out.println("isimArr = " + isimArr); // isimArr = [Ljava.lang.String;@5315b42e

        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr)); // Arrays.toString(isimArr) = [Muhammed, Sebnem, Musa, Ayse, Sennur, Recep]
        System.out.println("Arrays.toString(sayıArr) = " + Arrays.toString(sayıArr)); // Arrays.toString(sayıArr) = [42, 0, 0, 54, 54]

        // Array son index eleman
        System.out.println("son index eleman = " + sayıArr[sayıArr.length - 1]); // son index eleman = 54

        // Array ilk index eleman
        System.out.println("ilk index eleman = " + sayıArr[0]); // ilk index eleman = 42

        // Array olmayan index eleman
        // System.out.println("sayıArr[91] = " + sayıArr[91]); // ArrayIndexOutOfBoundsException

        // Array print etme
        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));

        System.out.println("*********");

        // Array elemanları print etme....
        for (int i = 0; i<isimArr.length; i++){
            System.out.print(isimArr[i]+" ");
        }

        // Arrays eleman natural ording(dogal sıralama)
        // alphabetic --- a'dan z'ye
        // numeric --- kucukten buyuge

        System.out.println();

        System.out.println("sıralama öncesi = " + Arrays.toString(isimArr));
        Arrays.sort(isimArr);
        System.out.println("sıralama sonrası = " + Arrays.toString(isimArr));

        System.out.println();

        System.out.println("Arrays.toString(sayıArr) = " + Arrays.toString(sayıArr));
        Arrays.sort(sayıArr);
        System.out.println("Arrays.toString(sayıArr) = " + Arrays.toString(sayıArr));


    }
}
