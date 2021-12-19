package java16;

import java.util.*;

public class Code16_5 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("‘åã", 300);
		prefs.put("–¼ŒÃ‰®", 280);
		prefs.put("“Œ‹", 1261);
		int tokyo = prefs.get("“Œ‹");
		System.out.println("“Œ‹‚ÌlŒû‚Í" + tokyo);

		prefs.remove("–¼ŒÃ‰®");
		prefs.put("‘åã", 500);
		int osaka = prefs.get("‘åã");
		System.out.println("‘åã‚ÌlŒû‚Í" + osaka);
	}
}
