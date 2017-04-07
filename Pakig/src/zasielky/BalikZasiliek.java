package zasielky;

import java.util.*;

/**
 * BalikZasiliek sluzi ako Composite navrhnoveho vzoru Composite.
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public class BalikZasiliek implements Dorucitelny {
	private double hmotnost;
	private String ciel;
	private ArrayList<Dorucitelny> zoznam;
	
	/*
	public BalikZasiliek() {
		this.hmotnost = 0.1;
		this.ciel = "N/A";
		this.zoznam = new ArrayList<Dorucitelny>();
	}
	*/
	
	public BalikZasiliek(String ciel) {
		this.hmotnost = 0.1;
		this.ciel = ciel;
		this.zoznam = new ArrayList<Dorucitelny>();
	}
	
	public BalikZasiliek(float hmotnost, String ciel) {
		this.hmotnost = hmotnost;
		this.ciel = ciel;
		this.zoznam = new ArrayList<Dorucitelny>();
	}
	
	public void pridajList(List list) {
		zoznam.add(list);
		hmotnost += list.zistiHmotnost();
	}
	
	public void odoberList(List list) {
		zoznam.remove(list);
		hmotnost -= list.zistiHmotnost();
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
}
