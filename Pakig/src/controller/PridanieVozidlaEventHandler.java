package controller;

import vozidla.*;
import javafx.event.*;
import javafx.scene.control.*;
import budovy.Budova;

/**
 * 
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
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

		// Vozidlu nebol zadaný názov
		if (nazovVozidla.getText().equals("")) {
			switch (typ) {
			case "Bicykel" :
				budova.pridajVozidlo(new Bicykel());
				break;
			case "Dodávka" :
				budova.pridajVozidlo(new Dodavka());
				break;
			case "Kamión" :
				budova.pridajVozidlo(new Kamion());
				break;
			case "Osobné auto" :
				budova.pridajVozidlo(new OsobneAuto());
				break;
			}
		}
		// Vozidlo má zadaný názov
		else {
			switch (typ) {
			case "Bicykel" :
				budova.pridajVozidlo(new Bicykel(nazovVozidla.getText()));
				break;
			case "Dodávka" :
				budova.pridajVozidlo(new Dodavka(nazovVozidla.getText()));
				break;
			case "Kamión" :
				budova.pridajVozidlo(new Kamion(nazovVozidla.getText()));
				break;
			case "Osobné auto" :
				budova.pridajVozidlo(new OsobneAuto(nazovVozidla.getText()));
				break;
			}
		}
	}
}
