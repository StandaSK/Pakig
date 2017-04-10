package vozidla;

/**
 * Bicykel ma minmalnu kapacitu, nizku rychlost a
 * nizku cenu prepravy. Vyuziva sa len na dorucovanie
 * listov z pobociek priamo adresatom.
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public class Bicykel extends Vozidlo {

	public Bicykel() {
		super("Bicykel", 5, 10, 10);
	}

	public Bicykel(String nazov) {
		super(nazov, 5, 10 ,10);
	}

	/*
	public Bicykel(String nazovVozidla, int kapacita, int rychlost, int cenaPrepravy) {
		super(nazovVozidla, kapacita, rychlost, cenaPrepravy);
	}
	*/

}
