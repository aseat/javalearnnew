package java16.question;

import java.util.*;

public class Hero {
	private String name;

	public Hero(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		Hero hero1 = new Hero("Ö“¡");
		Hero hero2 = new Hero("—é–Ø");
		List<Hero> heros = new ArrayList<Hero>();
		heros.add(hero1);
		heros.add(hero2);

		for (Hero hero : heros) {
			System.out.println(hero.getName());
		}

		Map<Hero, Integer> killEnemy = new HashMap<>();
		killEnemy.put(hero1, 3);
		killEnemy.put(hero2, 7);

		for (Hero key : killEnemy.keySet()) {
			Integer value = killEnemy.get(key);
			System.out.println(key.getName() + "‚ª“|‚µ‚½“G=" + value);
		}
	}
}
