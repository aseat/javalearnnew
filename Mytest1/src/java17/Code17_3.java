package java17;

import java.io.*;

public class Code17_3 {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("data.txt");
			fileWriter.write("hello");
			System.out.println("����");
		} catch (IOException error) {
			System.out.println("���炩�̗�O���������܂����B");
		} finally {
			fileWriter.close();
		}
	}
}
