package mypkg;
import java.util.Random;

public class Janken {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		
		if (num==0){
			System.out.println("グー");	
		}
		
		if (num==1){
			System.out.println("チョキ");	
		}
		
		if (num==2){
			System.out.println("パー");	
		}
		
		}
}