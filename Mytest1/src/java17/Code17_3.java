package java17;

import java.io.*;

public class Code17_3 {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("data.txt");
			fileWriter.write("hello");
			System.out.println("ê¨å˜");
		} catch (IOException error) {
			System.out.println("âΩÇÁÇ©ÇÃó·äOÇ™î≠ê∂ÇµÇ‹ÇµÇΩÅB");
		} finally {
			fileWriter.close();
		}
	}
}
