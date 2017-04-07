package budovy;

import java.util.*;

import vozidla.Vozidlo;
import zasielky.Dorucitelny;

public class Sklad implements Budova {
	private ArrayList<Vozidlo> vozidla;
	
	public Sklad() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prijmiZasielky(List<Dorucitelny> zasielky) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pridajVozidlo(Vozidlo vozidlo) {
		this.vozidla.add(vozidlo);
	}

	@Override
	public void odoberVozidlo(Vozidlo vozidlo) {
		this.vozidla.remove(vozidlo);
	}
	
}
