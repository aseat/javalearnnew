package java17;

import java.io.*;

public class Code17_2 {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("data.txt");
			fileWriter.write("hello");
			// 欠陥：例外が発生したらファイルが閉じないままになる
			fileWriter.close();
		} catch (Exception error) {
			System.out.println("何らかの例外が発生しました。");
		}
	}
}
