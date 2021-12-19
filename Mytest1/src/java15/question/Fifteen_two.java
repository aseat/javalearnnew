package java15.question;

public class Fifteen_two {

	public String concat(String folder, String file) {
		if (!folder.endsWith("")) {
			folder += "";
		}
		return folder + file;
	}
}
