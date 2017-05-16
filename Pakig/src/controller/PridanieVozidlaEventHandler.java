package controller;

import view.ExceptionDialog;
import vozidla.*;
import javafx.event.*;
import javafx.scene.control.*;
import budovy.*;

/**
 * 
 * @author Stanislav Jakubek
 *
 */
public class PridanieVozidlaEventHandler implements EventHandler<ActionEvent> {
	private Budova budova;
	private ComboBox<String> typVozidla;
	private TextField nazovVozidla;

	public PridanieVozidlaEventHandler(Budova budova, ComboBox<String> typVozidla, TextField nazovVozidla) {
		this.budova = budova;
		this.typVozidla = typVozidla;
		this.nazovVozidla = nazovVozidla;
	}

	@Override
	public void handle(ActionEvent arg0) {
		String typ = typVozidla.getValue();

		// Vozidlu nebol zadan˝ n·zov
		if (nazovVozidla.getText().equals("")) {
			switch (typ) {
			case "Bicykel" :
				budova.pridajVozidlo(new Bicykel());
				break;
			case "Dod·vka" :
				budova.pridajVozidlo(new Dodavka());
				break;
			case "OsobnÈ auto" :
				budova.pridajVozidlo(new OsobneAuto());
				break;
			case "KamiÛn" :
				if (budova instanceof Pobocka) {
					new ExceptionDialog(new NepovolenyTypVozidlaException("PoboËke nemoûno pridaù kamiÛn!"));
				}
				else {
					budova.pridajVozidlo(new Kamion());
				}
				break;
			}
		}
		// Vozidlo m· zadan˝ n·zov
		else {
			switch (typ) {
			case "Bicykel" :
				budova.pridajVozidlo(new Bicykel(nazovVozidla.getText()));
				break;
			case "Dod·vka" :
				budova.pridajVozidlo(new Dodavka(nazovVozidla.getText()));
				break;
			case "OsobnÈ auto" :
				budova.pridajVozidlo(new OsobneAuto(nazovVozidla.getText()));
				break;
			case "KamiÛn" :
				if (budova instanceof Pobocka) {
					new ExceptionDialog(new NepovolenyTypVozidlaException("PoboËke nemoûno pridaù kamiÛn!"));
				}
				else {
					budova.pridajVozidlo(new Kamion(nazovVozidla.getText()));
				}
				break;
			}
		}
	}
}
