package java18;

import java.io.*;

public class Code18_1 {

	public static void main(String[] args) throws Exception {
		FileReader fileReader = new FileReader("data.txt");
		int input = fileReader.read();
		while (input != -1) {
			System.out.print((char) input);
			input = fileReader.read();
		}
		fileReader.close();
	}
}
