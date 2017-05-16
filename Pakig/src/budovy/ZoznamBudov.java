package budovy;

import java.util.ArrayList;
import controller.NeexistujucaBudovaException;

/**
 * "Staticka" trieda ZoznamBudov sluzi na uchovavanie referencii
 * na vsetky budovy (pobocky a sklady).
 * @author Stanislav Jakubek
 *
 */
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
	 * @throws NeexistujucaBudovaException ak pobocka s danym nazvom neexistuje
	 */
	public static Pobocka najdiPobocku(String nazov) throws NeexistujucaBudovaException {
		for (Pobocka p : pobocky) {
			if (p.getNazov().equals(nazov))
				return p;
		}
		throw new NeexistujucaBudovaException("Daná poboèka neexistuje!");
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
	 * @throws NeexistujucaBudovaException ak sklad s danym nazvom neexistuje
	 */
	public static Sklad najdiSklad(String nazov) throws NeexistujucaBudovaException {
		for (Sklad s : sklady) {
			if (s.getNazov().equals(nazov))
				return s;
		}
		throw new NeexistujucaBudovaException("Daný sklad neexistuje!");
	}

	public static ArrayList<Pobocka> getPobocky() {
		return pobocky;
	}

	public static ArrayList<Sklad> getSklady() {
		return sklady;
	}
}
