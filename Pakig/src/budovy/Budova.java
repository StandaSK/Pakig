package budovy;

import java.util.List;
import vozidla.Vozidlo;
import zasielky.Dorucitelny;

/**
 * Rozhranie Budova deklaruje metody pre triedy z nej odvodene.
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public interface Budova {
	public void prijmiZasielky(List<Dorucitelny> zasielky);
	//public void odosliZasielky(List<Dorucitelny> zasielky);
	public void pridajVozidlo(Vozidlo vozidlo);
	public void odoberVozidlo(Vozidlo vozidlo);
}
