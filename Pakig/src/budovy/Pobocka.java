package budovy;

import java.util.*;
import vozidla.Vozidlo;
import zasielky.Zasielka;

/**
 * 
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public class Pobocka implements Budova {
	private String nazov;
	private ArrayList<Vozidlo> vozidla;
	private ArrayList<Zasielka> zasielky;

	public Pobocka(String nazov) {
		this.setNazov(nazov);
		this.vozidla = new ArrayList<Vozidlo>();
		this.zasielky = new ArrayList<Zasielka>();
	}

	/**
	 * Prijme dorucovane <b>zasielky</b>, prida ich do zoznamu zasiliek danej pobocky
	 * @param zasielky List zasiliek, ktore sa dorucuju na pobocku
	 */
	@Override
	public void prijmiZasielky(List<Zasielka> zasielky) {
		zasielky.forEach(zasielka -> this.zasielky.add(zasielka));
	}

	/**
	 * Odovzda zasielky danemu vozidlu
	 * @param vozidlo Vozidlo, ktoremu budu zasielky odovzdane
	 */
	public void odovzdajZasielky(Vozidlo vozidlo) {
		ArrayList<Zasielka> vybraneZasielky = this.triedZasielky();
		vybraneZasielky.removeAll(vozidlo.pridajZasielky(vybraneZasielky));
		this.zasielky.removeAll(vybraneZasielky);
	}

	/**
	 * Vytriedi zasielky, ktore nemaju ciel v danej pobocke
	 * @return ArrayList zasielok, nepatriacich do danej pobocky
	 */
	public ArrayList<Zasielka> triedZasielky() {
		ArrayList<Zasielka> triedeneZasielky = new ArrayList<Zasielka>();

		for (Zasielka z : this.zasielky) {
			if (!z.zistiCiel().equals(this.nazov))
				triedeneZasielky.add(z);
		}
		return triedeneZasielky;
	}

	/**
	 * Prida pobocke zasielku
	 * @param zasielka Pridavana zasielka
	 */
	public void pridajZasielku(Zasielka zasielka) {
		this.zasielky.add(zasielka);
	}

	@Override
	public ArrayList<Zasielka> getZasielky() {
		return this.zasielky;
	}

	@Override
	public void pridajVozidlo(Vozidlo vozidlo) {
		this.vozidla.add(vozidlo);
	}

	@Override
	public ArrayList<Vozidlo> getVozidla() {
		return this.vozidla;
	}

	@Override
	public Vozidlo getVozidlo(String nazov) {
		for (Vozidlo v : this.vozidla) {
			if (v.getNazov().equals(nazov))
				return v;
		}
		return null;
	}

	@Override
	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

	@Override
	public String getNazov() {
		return this.nazov;
	}

}
