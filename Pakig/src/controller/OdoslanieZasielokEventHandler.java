package controller;

import vozidla.Vozidlo;
import budovy.*;
import javafx.event.*;
import javafx.scene.control.*;

public class OdoslanieZasielokEventHandler implements EventHandler<ActionEvent> {
	private Sklad sklad;
	private ComboBox<String> vyberPobocky;
	private ComboBox<String> vyberVozidla;

	public OdoslanieZasielokEventHandler(Sklad sklad, ComboBox<String> vyberPobocky, ComboBox<String> vyberVozidla) {
		this.sklad = sklad;
		this.vyberPobocky = vyberPobocky;
		this.vyberVozidla = vyberVozidla;
	}

	@Override
	public void handle(ActionEvent arg0) {
		Vozidlo vybraneVozidlo = sklad.getVozidlo(vyberVozidla.getValue());
		String nazovVybranejPobocky = vyberPobocky.getValue();
		Pobocka vybranaPobocka = ZoznamBudov.najdiPobocku(nazovVybranejPobocky);

		sklad.odovzdajZasielky(vybraneVozidlo, nazovVybranejPobocky);
		vybraneVozidlo.odovzdajZasielky(vybranaPobocka);
		sklad.prijmiZasielky(vybraneVozidlo.getZasielky());
	}

}
