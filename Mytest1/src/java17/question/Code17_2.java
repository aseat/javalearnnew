package java17.question;

public class Code17_2 {
	public static void main(String[] args) {
		try {
			String string = null;
			System.out.println(string.length());
		} catch (NullPointerException error) {
			System.out.println("NullPointerException��O��catch���܂����B");
			System.out.println("�\�\�X�^�[�N�g���[�X(��������)�\�\");
			error.printStackTrace();
			System.out.println("�\�\�X�^�[�N�g���[�X(�����܂�)�\�\");
		}
	}
}
