package vozidla;

import java.util.ArrayList;
import zasielky.Zasielka;

/**
 * Abstraktna trieda Vozidlo sa vyuziva ako
 * spolocny nadtyp vsetkych vozidiel.
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public abstract class Vozidlo {
	private String nazovVozidla;
	private int kapacita;
	private int rychlost;
	private int cenaPrepravy;
	private ArrayList<Zasielka> zasielky;

	public Vozidlo(String nazovVozidla, int kapacita, int rychlost, int cenaPrepravy) {
		this.nazovVozidla = nazovVozidla;
		this.kapacita = kapacita;
		this.rychlost = rychlost;
		this.cenaPrepravy = cenaPrepravy;
		this.zasielky = new ArrayList<Zasielka>();
	}

	public void pridajZasielku(Zasielka zasielka) {
		this.zasielky.add(zasielka);
	}

	public void odoberZasielky() {
		this.zasielky.clear();
	}

	/**
	 * @return nazov vozidla
	 */
	public String getNazovVozidla() {
		return nazovVozidla;
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
		this.nazovVozidla = nazovVozidla;
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
