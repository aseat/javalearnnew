package java17;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Code17_1 {
	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("data.txt");
		} catch (IOException e) {
			System.out.println("ÉGÉâÅ[Ç™î≠ê∂ÇµÇ‹ÇµÇΩÅB");
		}

	}
}
