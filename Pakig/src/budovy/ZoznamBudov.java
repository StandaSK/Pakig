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
	
	public void pridajSklad(String nazov) {
		this.sklady.add(new Sklad(nazov));
	}

}
