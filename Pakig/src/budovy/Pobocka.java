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

	@Override
	public void odovzdajZasielky(Vozidlo vozidlo) {
		vozidlo.pridajZasielky(zasielky);
	}
	
	public void pridajZasielku(Zasielka zasielka) {
		zasielky.add(zasielka);
	}

	@Override
	public void pridajVozidlo(Vozidlo vozidlo) {
		this.vozidla.add(vozidlo);
	}

	@Override
	public void odoberVozidlo(Vozidlo vozidlo) {
		this.vozidla.remove(vozidlo);
	}

	@Override
	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

	@Override
	public String getNazov() {
		return nazov;
	}

}
