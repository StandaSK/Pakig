package budovy;

import java.util.List;
import vozidla.Vozidlo;
import zasielky.Zasielka;

/**
 * Rozhranie Budova deklaruje metody pre triedy z nej odvodene.
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public interface Budova {
	public void prijmiZasielky(List<Zasielka> zasielky);
	public void odovzdajZasielky(Vozidlo vozidlo);
	public void pridajVozidlo(Vozidlo vozidlo);
	public void odoberVozidlo(Vozidlo vozidlo);
	public void setNazov(String nazov);
	public String getNazov();
}
