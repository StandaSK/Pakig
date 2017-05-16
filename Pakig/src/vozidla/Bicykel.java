package vozidla;

import java.util.ArrayList;
import java.util.List;
import zasielky.Zasielka;

/**
 * Bicykel sa vyuziva len na prepravu listov.
 * Ma minimalnu kapacitu, nizku rychlost a nizku cenu prepravy.
 * @author Stanislav Jakubek
 * 
 */
public class Bicykel extends Vozidlo {

	public Bicykel() {
		super("Bicykel", 5, 10, 10);
	}

	public Bicykel(String nazov) {
		super(nazov, 5, 10 ,10);
	}

	/**
	 * Prida bicyklu <b>Listove zasielky</b>, odmietne ostatne typy
	 * @param zasielky Zasielky, ktore dostane vozidlo
	 * @return List odmietnutych zasielok
	 */
	@Override
	public List<Zasielka> pridajZasielky(List<Zasielka> zasielky) {
		ArrayList<Zasielka> odmietnuteZasielky = new ArrayList<Zasielka>();

		zasielky.forEach(zasielka -> {
			if (zasielka instanceof zasielky.List) {
				this.getZasielky().add(zasielka);
			}
			else {
				odmietnuteZasielky.add(zasielka);
			}
		});

		return odmietnuteZasielky;
	}

}
