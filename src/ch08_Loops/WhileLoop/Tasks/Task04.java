package ch08_Loops.WhileLoop.Tasks;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */

		int sayac = 0;
		int i = 999;

		while(i>99){
			if(i%4 == 0 && i%6 == 0){
				sayac++;
				System.out.println(i+" ");
			}i--;
		}
		System.out.println(sayac);







	}

}
