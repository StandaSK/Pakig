package vozidla;

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

	public Vozidlo(String nazovVozidla, int kapacita, int rychlost, int cenaPrepravy) {
		this.nazovVozidla = nazovVozidla;
		this.kapacita = kapacita;
		this.rychlost = rychlost;
		this.cenaPrepravy = cenaPrepravy;
	}

	/**
	 * @return the nazovVozidla
	 */
	public String getNazovVozidla() {
		return nazovVozidla;
	}

	/**
	 * @return kapacita
	 */
	public int getKapacita() {
		return kapacita;
	}

	/**
	 * @return rychlost
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

}
