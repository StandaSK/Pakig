package vozidla;

/**
 * Bicykel ma minimalnu kapacitu, nizku rychlost a
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

}
