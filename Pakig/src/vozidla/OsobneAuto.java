package vozidla;

/**
 * Osobne auto ma vysoku rychlost prepravy, no
 * nizku kapacitu a vysoku cenu prepravy.
 * @author Stanislav Jakubek
 * 
 */
public class OsobneAuto extends Vozidlo {

	public OsobneAuto() {
		super("Osobn� auto", 10, 100, 100);
	}

	public OsobneAuto(String nazov) {
		super(nazov, 10, 100, 100);
	}

}
