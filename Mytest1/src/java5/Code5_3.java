package java5;

public class Code5_3 {
	
	public static void add(int[] array ) {
		for(int i : array) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		int [] array = {4,5,6};
		add(array);
	}
}
