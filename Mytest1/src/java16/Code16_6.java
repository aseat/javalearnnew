package java16;

import java.util.HashMap;
import java.util.Map;

public class Code16_6 {

	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("大阪", 300);
		prefs.put("名古屋", 280);
		prefs.put("東京", 1261);

		for (String key : prefs.keySet()) {

			Integer value = prefs.get(key);

			System.out.println(key + "の人口は" + value);
		}
	}

}
