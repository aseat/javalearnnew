package java17;

import java.io.*;

public class Code17_2 {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("data.txt");
			fileWriter.write("hello");
			// ���ׁF��O������������t�@�C�������Ȃ��܂܂ɂȂ�
			fileWriter.close();
		} catch (Exception error) {
			System.out.println("���炩�̗�O���������܂����B");
		}
	}
}
