package zasielky;

import java.util.*;

/**
 * BalikZasiliek sluzi ako Composite navrhnoveho vzoru Composite.
 * @author Stanislav Jakubek
 *
 */
public class BalikZasiliek implements Zasielka {
	private double hmotnost;
	private String ciel;
	private ArrayList<Zasielka> zoznam;

	public BalikZasiliek(String ciel) {
		this.nastavHmotnost(0.1);
		this.nastavCiel(ciel);
		this.zoznam = new ArrayList<Zasielka>();
	}

	public BalikZasiliek(double hmotnost, String ciel) {
		this.nastavHmotnost(hmotnost);
		this.nastavCiel(ciel);
		this.zoznam = new ArrayList<Zasielka>();
	}

	public void pridajZasielku(Zasielka zasielka) {
		zoznam.add(zasielka);
		hmotnost += zasielka.zistiHmotnost();
	}

	public void odoberZasielku(Zasielka zasielka) {
		zoznam.remove(zasielka);
		hmotnost -= zasielka.zistiHmotnost();
	}

	@Override
	public void nastavCiel(String ciel) {
		this.ciel = ciel;
	}

	@Override
	public String zistiCiel() {
		return ciel;
	}

	@Override
	public void nastavHmotnost(double hmotnost) {
		this.hmotnost = hmotnost;
	}

	@Override
	public double zistiHmotnost() {
		return hmotnost;
	}

	/**
	 * @return Nazov triedy - String "Bal�k Z�siliek"
	 */
	@Override
	public String getNazovTriedy() {
		return "Bal�k Z�siliek";
	}
}
