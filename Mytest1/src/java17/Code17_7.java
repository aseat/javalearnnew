package java17;

public class Code17_7 {

	public static void main(String[] args) {
		try {
			throw new UnsupportedMusicFileException("���Ή��̃t�@�C���ł��B");
		} catch (UnsupportedMusicFileException error) {
			error.printStackTrace();
		}
	}

}
