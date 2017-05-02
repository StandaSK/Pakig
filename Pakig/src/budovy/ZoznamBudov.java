package budovy;

import java.util.ArrayList;

public final class ZoznamBudov {
	private static ArrayList<Pobocka> pobocky = new ArrayList<Pobocka>();
	private static ArrayList<Sklad> sklady = new ArrayList<Sklad>();

	private ZoznamBudov() {
		
	}

	public static void pridajPobocku(String nazov) {
		pobocky.add(new Pobocka(nazov));
	}

	public static Pobocka najdiPobocku(String nazov) {
		for (Pobocka p : pobocky) {
			if (p.getNazov().equals(nazov))
				return p;
		}
		return null;
	}

	public static void pridajSklad(String nazov) {
		sklady.add(new Sklad(nazov));
	}

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
