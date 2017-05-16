package vozidla;

/**
 * Kamion sluzi na prepravu listov a balikov medzi
 * pobockami a skladmi, nedorucuje postu adresatom.
 * Ma vysoku kapacitu, nizku rychlost ale aj nizku
 * cenu prepravy.
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 * 
 */
public class Kamion extends Vozidlo {

	public Kamion() {
		super("Kamión", 100, 10, 10);
	}

	public Kamion(String nazov) {
		super(nazov, 100, 10, 10);
	}

}
