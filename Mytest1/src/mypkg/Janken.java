package mypkg;
import java.util.Random;

public class Janken {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		
		if (num==0){
			System.out.println("�O�[");	
		}
		
		if (num==1){
			System.out.println("�`���L");	
		}
		
		if (num==2){
			System.out.println("�p�[");	
		}
		
		}
}