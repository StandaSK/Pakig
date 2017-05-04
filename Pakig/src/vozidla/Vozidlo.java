package vozidla;

import java.util.*;
import budovy.*;
import zasielky.Zasielka;

/**
 * Abstraktna trieda Vozidlo sa vyuziva ako
 * spolocny nadtyp vsetkych vozidiel.
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 */
public abstract class Vozidlo {
	private String nazov;
	private int kapacita;
	private int rychlost;
	private int cenaPrepravy;
	private ArrayList<Zasielka> zasielky;

	public Vozidlo(String nazov, int kapacita, int rychlost, int cenaPrepravy) {
		this.nazov = nazov;
		this.kapacita = kapacita;
		this.rychlost = rychlost;
		this.cenaPrepravy = cenaPrepravy;
		this.zasielky = new ArrayList<Zasielka>();
	}

	/**
	 * Prida vozidlu zasielky 
	 * @param zasielky Zasielky, ktore dostane vozidlo
	 */
	public void pridajZasielky(List<Zasielka> zasielky) {
		zasielky.forEach(zasielka -> this.zasielky.add(zasielka));
	}

	/**
	 * Odovzda vsetky zasielky danej pobocke
	 * @param pobocka Pobocka, ktorej vozidlo odovzda vsetky svoje zasielky
	 */
	public void odovzdajZasielky(Pobocka pobocka) {
		ArrayList<Zasielka> kopia = new ArrayList<Zasielka>(zasielky);
		this.odoberZasielky();
		pobocka.odovzdajZasielky(this);
		pobocka.prijmiZasielky(kopia);
	}

	/**
	 * Odovzda vsetky zasielky danemu skladu
	 * @param sklad Sklad, ktoremu vozidlo odovzda vsetky svoje zasielky
	 */
	public void odovzdajZasielky(Sklad sklad) {
		ArrayList<Zasielka> kopia = new ArrayList<Zasielka>(zasielky);
		this.odoberZasielky();
		sklad.prijmiZasielky(kopia);
	}

	/**
	 * Odstrani vsetky zasielky vozidla
	 */
	public void odoberZasielky() {
		this.zasielky.clear();
	}

	/**
	 * @return nazov vozidla
	 */
	public String getNazov() {
		return nazov;
	}

	/**
	 * @return kapacita vozidla
	 */
	public int getKapacita() {
		return kapacita;
	}

	/**
	 * @return rychlost vozidla
	 */
	public int getRychlost() {
		return rychlost;
	}

	/**
	 * @return cena prepravy zasielok
	 */
	public int getCenaPrepravy() {
		return cenaPrepravy;
	}

	/**
	 * @return ArrayList zasielok
	 */
	public ArrayList<Zasielka> getZasielky() {
		return zasielky;
	}

	/**
	 * @param nazovVozidla the nazovVozidla to set
	 */
	public void setNazovVozidla(String nazovVozidla) {
		this.nazov = nazovVozidla;
	}

	/**
	 * @param kapacita kapacita vozidla
	 */
	public void setKapacita(int kapacita) {
		this.kapacita = kapacita;
	}

	/**
	 * @param rychlost rychlost vozidla
	 */
	public void setRychlost(int rychlost) {
		this.rychlost = rychlost;
	}

	/**
	 * @param cenaPrepravy cena prepravy zasielok
	 */
	public void setCenaPrepravy(int cenaPrepravy) {
		this.cenaPrepravy = cenaPrepravy;
	}

	/**
	 * @param zasielky ArrayList zasielok
	 */
	public void setZasielky(ArrayList<Zasielka> zasielky) {
		this.zasielky = zasielky;
	}

}
