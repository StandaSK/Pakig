package budovy;

import java.util.*;
import vozidla.Vozidlo;
import zasielky.Zasielka;

public class Pobocka implements Budova {
	private String nazov;
	private ArrayList<Vozidlo> vozidla;
	private ArrayList<Zasielka> zasielky;

	public Pobocka(String nazov) {
		this.setNazov(nazov);
		this.vozidla = new ArrayList<Vozidlo>();
		this.zasielky = new ArrayList<Zasielka>();
	}

	@Override
	public void prijmiZasielky(List<Zasielka> zasielky) {
		zasielky.forEach(zasielka -> this.zasielky.add(zasielka));
	}

	/**
	 * Odovzda zasielky danemu vozidlu
	 * @param vozidlo Vozidlo, ktoremu budu zasielky odovzdane
	 */
	public void odovzdajZasielky(Vozidlo vozidlo) {
		//TODO Prerobiù nech pred·va a odober· len z·sielky neurËenÈ pre dan˙ poboËku
		vozidlo.pridajZasielky(this.zasielky);
		this.zasielky.clear();
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

	/*
	@Override
	public void odoberVozidlo(Vozidlo vozidlo) {
		this.vozidla.remove(vozidlo);
	}
	*/

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
