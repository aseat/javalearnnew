package java16;

import java.util.*;

class Hero {
	public String name;
}

public class Code16_7 {
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "�~�i�g";
		List<Hero> list = new ArrayList<Hero>();
		list.add(hero);

		hero.name = "�X�K����";
		System.out.println(list.get(0).name);
	}
}
