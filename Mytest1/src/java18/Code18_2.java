package java18;

import java.io.*;

public class Code18_2 {

	public static void main(String[] args) throws Exception {
		FileWriter fileWriter = new FileWriter("data.txt");
		fileWriter.write('‚»');
		fileWriter.write('‚ê');
		fileWriter.write('‚Å');
		fileWriter.write('‚Í');
		fileWriter.close();
	}
}
