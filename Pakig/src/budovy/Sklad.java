package budovy;

import java.util.*;

import controller.NeexistujuceVozidloException;
import vozidla.Vozidlo;
import zasielky.Zasielka;

/**
 * 
 * @author Stanislav Jakubek
 *
 */
public class Sklad implements Budova {
	private String nazov;
	private ArrayList<Vozidlo> vozidla;
	private ArrayList<Zasielka> zasielky;

	public Sklad(String nazov) {
		this.setNazov(nazov);
		this.vozidla = new ArrayList<Vozidlo>();
		this.zasielky = new ArrayList<Zasielka>();
	}

	/**
	 * Prijme dorucovane <b>zasielky</b>, prida ich do zoznamu zasiliek daneho skladu
	 * @param zasielky List zasiliek, ktore sa dorucuju do skladu
	 */
	@Override
	public void prijmiZasielky(List<Zasielka> zasielky) {
		zasielky.forEach(zasielka -> this.zasielky.add(zasielka));
	}

	/**
	 * Odovzda danemu vozidlu zasielky s danym cielom
	 * @param vozidlo Vozidlo, ktoremu budu zasielky odovzdane
	 * @param ciel Ciel zasielok
	 */
	public void odovzdajZasielky(Vozidlo vozidlo, String ciel) {
		ArrayList<Zasielka> vybraneZasielky = this.triedZasielky(ciel);
		vybraneZasielky.removeAll(vozidlo.pridajZasielky(vybraneZasielky));
		this.zasielky.removeAll(vybraneZasielky);
	}

	@Override
	public ArrayList<Zasielka> getZasielky() {
		return this.zasielky;
	}

	/**
	 * Triedi zasielky z daneho skladu podla ich ciela
	 * @param ciel Ciel zasielok
	 * @return ArrayList zasielok s danym cielom
	 */
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
	public ArrayList<Vozidlo> getVozidla() {
		return this.vozidla;
	}

	/**
	 * Funkcia vrati hladane vozidlo patriace danemu skladu
	 * @param nazov Nazov hladaneho vozidla
	 * @return Hladane vozidlo
	 * @throws NeexistujuceVozidloException ak vozidlo s danym nazvom neexistuje
	 */
	@Override
	public Vozidlo getVozidlo(String nazov) throws NeexistujuceVozidloException {
		for (Vozidlo v : this.vozidla) {
			if (v.getNazov().equals(nazov))
				return v;
		}
		throw new NeexistujuceVozidloException("Vozidlo s dan�m n�zvom neexistuje!");
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
