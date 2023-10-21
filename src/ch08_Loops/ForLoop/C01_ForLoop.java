package ch08_Loops.ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // Loop --> tekrarlayan sabit aksiyonlar icin tanımlanan code blok'larıdır

       // 41 kere maşallah print eden kod create ediniz

       for (int i =1; i < 42; i++) {
           System.out.println(i+". maşallah");
           System.out.println("agaya selam");
       }
        System.out.println("javaCan'a selam");

       // task01 -> 2 basamaklı tek sayıları aynı satıra

        for (int i =11; i <100; i+=2){
            System.out.print(i+" ");
        }

        System.out.println();

        for (int i =0; i<=99;i++){
            if (i>10 && i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
