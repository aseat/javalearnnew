package java17;

import java.io.*;

public class Code17_4 {

	public static void main(String[] args) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("data.txt");
			fileWriter.write("hello");
			System.out.println("����");
		} catch (IOException error) {
			System.out.println("���炩�̗�O���������܂����B");
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					;
				}
			}
		}
	}
}
