package java17;

public class Code17_7 {

	public static void main(String[] args) {
		try {
			throw new UnsupportedMusicFileException("未対応のファイルです。");
		} catch (UnsupportedMusicFileException error) {
			error.printStackTrace();
		}
	}

}
