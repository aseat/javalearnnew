package java16;

import java.util.*;

public class Code16_5 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("���", 300);
		prefs.put("���É�", 280);
		prefs.put("����", 1261);
		int tokyo = prefs.get("����");
		System.out.println("�����̐l����" + tokyo);

		prefs.remove("���É�");
		prefs.put("���", 500);
		int osaka = prefs.get("���");
		System.out.println("���̐l����" + osaka);
	}
}
