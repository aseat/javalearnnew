package java16;

import java.util.*;

public class Code16_2 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("��");
		names.add("�L��");
		names.add("����");
		names.add("�����q");

		Iterator it = names.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
