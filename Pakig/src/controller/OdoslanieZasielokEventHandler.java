package controller;

import vozidla.Vozidlo;
import budovy.*;
import javafx.event.*;
import javafx.scene.control.*;

public class OdoslanieZasielokEventHandler implements EventHandler<ActionEvent> {
	private Sklad sklad;
	private TextField vyberPobocky;
	private ComboBox<String> vyberVozidla;

	public OdoslanieZasielokEventHandler(Sklad sklad, TextField vyberPobocky, ComboBox<String> vyberVozidla) {
		this.sklad = sklad;
		this.vyberPobocky = vyberPobocky;
		this.vyberVozidla = vyberVozidla;
	}

	@Override
	public void handle(ActionEvent arg0) {
		Vozidlo vybraneVozidlo = sklad.getVozidlo(vyberVozidla.getValue());
		Pobocka vybranaPobocka = ZoznamBudov.najdiPobocku(vyberPobocky.getText());

		vybraneVozidlo.setZasielky(sklad.triedZasielky(vyberPobocky.toString()));
		vybraneVozidlo.odovzdajZasielky(vybranaPobocka);
	}

}
