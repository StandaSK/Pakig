package budovy;

import java.util.*;
import vozidla.Vozidlo;
import zasielky.Zasielka;

/**
 * Rozhranie Budova deklaruje metody pre triedy z nej odvodene.
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public interface Budova {
	public void prijmiZasielky(List<Zasielka> zasielky);
	public ArrayList<Zasielka> getZasielky();
	public void pridajVozidlo(Vozidlo vozidlo);
	public void odoberVozidlo(Vozidlo vozidlo);
	public ArrayList<Vozidlo> getVozidla();
	public Vozidlo getVozidlo(String nazov);
	public void setNazov(String nazov);
	public String getNazov();
}
