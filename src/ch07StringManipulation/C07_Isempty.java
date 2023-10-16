package ch07StringManipulation;

public class C07_Isempty {
    public static void main(String[] args) {

         /*
 String IsEmpty
 String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
 isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
 Yani o String'in length() 0 demektir.
 length()==0 demek isEmpty() true verir demektir.
        */

        String str = "madem gelding dünyaya otur çalış JAVA'ya";
        System.out.println("str.isEmpty() = " + str.isEmpty()); // false
        System.out.println(str.length()); // 40

        String str1 = "";
        System.out.println("str1.isEmpty() = " + str1.isEmpty()); // true
        System.out.println("str1.length() = " + str1.length()); // 0

        String str2 = " ";
        System.out.println("str2.isEmpty() = " + str2.isEmpty()); // false
        System.out.println("str2.length() = " + str2.length()); // 1

        String str3 = null;
        // System.out.println("str3.isEmpty() = " + str3.isEmpty()); ------- RTE


        /*
        isBlank()-> hem "boş tanımlanan  String" için hem de "sadece space"
        içeren Strinler içn true diğerlerine false return eder
         */

        System.out.println("str1.isBlank() = " + str1.isBlank()); // true
        System.out.println("str2.isBlank() = " + str2.isBlank()); // true


    }
}
