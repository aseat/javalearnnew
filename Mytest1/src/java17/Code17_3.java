package java17;

import java.io.*;

public class Code17_3 {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("data.txt");
			fileWriter.write("hello");
			System.out.println("成功");
		} catch (IOException error) {
			System.out.println("何らかの例外が発生しました。");
		} finally {
			fileWriter.close();
		}
	}
}
