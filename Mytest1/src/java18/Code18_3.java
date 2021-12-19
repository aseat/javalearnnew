package java18;

import java.io.InputStream;
import java.net.URL;

public class Code18_3 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.lovelive-anime.jp/yuigaoka/live/sp_1stlive/");
		InputStream inputStream = url.openStream();
		int i = inputStream.read();
		while (i != -1) {
			char c = (char) i;
			System.out.print(c);
			i = inputStream.read();
		}
	}

}
