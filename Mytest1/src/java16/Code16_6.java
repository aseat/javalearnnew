package java16;

import java.util.HashMap;
import java.util.Map;

public class Code16_6 {

	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("‘åã", 300);
		prefs.put("–¼ŒÃ‰®", 280);
		prefs.put("“Œ‹", 1261);

		for (String key : prefs.keySet()) {

			Integer value = prefs.get(key);

			System.out.println(key + "‚ÌlŒû‚Í" + value);
		}
	}

}
