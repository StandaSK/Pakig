package budovy;

import java.util.*;
import vozidla.Vozidlo;
import zasielky.Zasielka;

public class Sklad implements Budova {
	private String nazov;
	private ArrayList<Vozidlo> vozidla;
	private ArrayList<Zasielka> zasielky;

	public Sklad(String nazov) {
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
		//vozidlo.pridajZasielky(zasielky);
	}

	@Override
	public ArrayList<Zasielka> getZasielky() {
		return this.zasielky;
	}

	public ArrayList<Zasielka> triedZasielky(String ciel) {
		ArrayList<Zasielka> triedeneZasielky = new ArrayList<Zasielka>();

		for (Zasielka z : this.zasielky) {
			if (z.zistiCiel().equals(ciel))
				triedeneZasielky.add(z);
		}
		return triedeneZasielky;
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
