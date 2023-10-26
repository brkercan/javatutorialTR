package ch09_Loops.ForLoop;

public class C04_NestedLoop {
    public static void main(String[] args) {

        /*
   task->: Asagidaki output'u print eden code create ediniz.
               Hafta: 1
                 Gun: 1
                 Gun: 2
                 Gun: 3
                 .....
               Hafta: 2
                 Gun: 1
                 Gun: 2
                 Gun: 3
                 ....
               Hafta: 3
                 Gun: 1
                 Gun: 2
                 Gun: 3
                 ....
*/
        for (int hafta = 1; hafta<=3; hafta++) {
            System.out.println("hafta: " + hafta);
            for(int gun = 1; gun<=3; gun++) {
                System.out.println("gun: " + gun);
            }
        }
    }


}
