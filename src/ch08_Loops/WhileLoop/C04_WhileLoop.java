package ch08_Loops.WhileLoop;

public class C04_WhileLoop {
    public static void main(String[] args) {

        int i = 100;

        while(i<=999){
            if(i%4==0){
                System.out.print(i+" ");
            }i++;
        }

        System.out.println("********************");

        for (int j=100; j<=999; j++) {
            if(j%4==0){
                System.out.print(j+" ");
            }
        }
    }
}
