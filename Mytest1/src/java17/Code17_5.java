package java17;

import java.io.*;

public class Code17_5 {

	public static void main(String[] args) {
		try (FileWriter fileWriter = new FileWriter("data.txt");) {
			fileWriter.write("hello");
			System.out.println("¬Œ÷");
		} catch (IOException error) {
			System.out.println("‰½‚ç‚©‚Ì—áŠO‚ª”­¶‚µ‚Ü‚µ‚½B");
		}
	}
}
