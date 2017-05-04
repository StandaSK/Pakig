package budovy;

import java.util.ArrayList;

public final class ZoznamBudov {
	private static ArrayList<Pobocka> pobocky = new ArrayList<Pobocka>();
	private static ArrayList<Sklad> sklady = new ArrayList<Sklad>();

	private ZoznamBudov() {
		
	}

	/**
	 * Vytvori a prida do zoznamu novu pobocku s danym nazvom
	 * @param nazov Nazov novej pobocky
	 */
	public static void pridajPobocku(String nazov) {
		pobocky.add(new Pobocka(nazov));
	}

	/**
	 * Najde v zozname pobocku s danym nazvom
	 * @param nazov Nazov hladanej pobocky
	 * @return Pobocka s danym nazvom
	 */
	public static Pobocka najdiPobocku(String nazov) {
		for (Pobocka p : pobocky) {
			if (p.getNazov().equals(nazov))
				return p;
		}
		return null;
	}

	/**
	 * Vytvori a prida do zoznamu novy sklad s danym nazvom
	 * @param nazov Nazov noveho skladu
	 */
	public static void pridajSklad(String nazov) {
		sklady.add(new Sklad(nazov));
	}

	/**
	 * Najde v zozname sklad s danym nazvom
	 * @param nazov Nazov hladaneho skladu
	 * @return Sklad s danym nazvom
	 */
	public static Sklad najdiSklad(String nazov) {
		for (Sklad s : sklady) {
			if (s.getNazov().equals(nazov))
				return s;
		}
		return null;
	}

	public static ArrayList<Pobocka> getPobocky() {
		return pobocky;
	}

	public static ArrayList<Sklad> getSklady() {
		return sklady;
	}
}
