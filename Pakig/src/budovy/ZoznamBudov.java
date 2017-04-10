package budovy;

import java.util.ArrayList;

public class ZoznamBudov {
	private ArrayList<Pobocka> pobocky;
	private ArrayList<Sklad> sklady;

	public ZoznamBudov() {
		this.pobocky = new ArrayList<Pobocka>();
		this.sklady = new ArrayList<Sklad>();
	}

	public void pridajPobocku(String nazov) {
		this.pobocky.add(new Pobocka(nazov));
	}

	public Pobocka najdiPobocku(String nazov) {
		for (Pobocka p : pobocky) {
			if (p.getNazov().equals(nazov))
				return p;
		}
		return null;
	}

	public void pridajSklad(String nazov) {
		this.sklady.add(new Sklad(nazov));
	}

	public Sklad najdiSklad(String nazov) {
		for (Sklad s : sklady) {
			if (s.getNazov().equals(nazov))
				return s;
		}
		return null;
	}

	public ArrayList<Pobocka> getPobocky() {
		return pobocky;
	}

	public ArrayList<Sklad> getSklady() {
		return sklady;
	}
}
