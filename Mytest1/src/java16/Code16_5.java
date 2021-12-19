package java16;

import java.util.*;

public class Code16_5 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("大阪", 300);
		prefs.put("名古屋", 280);
		prefs.put("東京", 1261);
		int tokyo = prefs.get("東京");
		System.out.println("東京の人口は" + tokyo);

		prefs.remove("名古屋");
		prefs.put("大阪", 500);
		int osaka = prefs.get("大阪");
		System.out.println("大阪の人口は" + osaka);
	}
}
