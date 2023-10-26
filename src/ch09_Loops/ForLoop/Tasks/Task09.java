package ch09_Loops.ForLoop.Tasks;

public class Task09 {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */

        for (int i = 1; i <=3 ; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
