package ch07StringManipulation;

import static java.lang.Integer.parseInt;

public class C13_ValueOf_parse {
    public static void main(String[] args) {

        /*
 Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
 Stringlerle matematiksel islemler yapabilmemizi saglar.

valueOf(); meth hem Integer wrapper  hem de String Class'da bulunur. Integer wrapper Class
 valueOf() methdou String'i integer'a  String Class valueOf() methodu integer'i String'e cevirir.
 */

// task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..

        String b1 = "10000";
        String b2 = "12000";

        int yeniB1 = Integer.valueOf(b1); // String olan b1 integer'a çevirerek int data type atandı
        int yeniB2 = Integer.valueOf(b2); // String olan b2 integer'a çevirerek int data type atandı

        int bagısToplamı = yeniB1+yeniB2;
        System.out.println("bagısToplamı = " + bagısToplamı);

        /**dersten bagımsız......
         * int yas = 33; // primitive data type // method uygulanamaz....
         * Integer yas = 33; // non-primitive data type // method lar uygulanabilir....
         */

        int tc = 1268945674;
        String strTc = String.valueOf(tc); // int tanımlanan tc String data type atandı

        System.out.println("tc = " + tc);
        System.out.println("strTc = " + strTc);
        System.out.println("(tc+strTc) = " + (tc + strTc));



          /*
        Task-> String strA="$13.99"  String strB="$17.55" parse method kullanarak strA+strB
        toplamını print den code create ediniz
         output: strA+strB=31.54
         */

        String strA="$13.99";
        String strB="$17.55";


        /**
        int yeniA = Integer.valueOf(strA);  // RTE
        int yeniB = Integer.valueOf(strB);

        System.out.println("(yeniA+yeniB) = " + (yeniA + yeniB));
        */


        double yeniA = Double.parseDouble(strA.substring(1));
        double yeniB = Double.parseDouble(strA.substring(1));
        System.out.println("(yeniA+yeniB) = " + (yeniA + yeniB));

        double yeniAA = Double.parseDouble(strA.replaceAll("\\D", ""));
        double yeniBB = Double.parseDouble(strB.replaceAll("\\D", ""));
        System.out.println("(yeniAA+yeniBB) = " + (yeniAA + yeniBB)/100);

    }
}
