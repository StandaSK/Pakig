package vozidla;

/**
 * Dodavka disponuje priemernou rychlostou pri dorucovani,
 * priemernu kapacitu a priemernu cenu prepravy zasielok.
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public class Dodavka extends Vozidlo {

	public Dodavka() {
		super("Dodavka", 50, 50, 50);
	}

	public Dodavka(String nazov) {
		super(nazov, 50, 50, 50);
	}

	/*
	public Dodavka(int kapacita, int rychlost, int cenaPrepravy) {
		super(kapacita, rychlost, cenaPrepravy);
	}
	*/

}