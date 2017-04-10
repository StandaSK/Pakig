package controller;

import vozidla.*;
import javafx.event.*;
import javafx.scene.control.*;
import budovy.Budova;

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
		
		if (nazovVozidla.equals("")) {
			switch (typ) {
			case "Bicykel" :
				budova.pridajVozidlo(new Bicykel());
				break;
			case "Dod�vka" :
				budova.pridajVozidlo(new Dodavka());
				break;
			case "Kami�n" :
				budova.pridajVozidlo(new Kamion());
				break;
			case "Osobn� auto" :
				budova.pridajVozidlo(new OsobneAuto());
				break;
			}
		}
		else {
			switch (typ) {
			case "Bicykel" :
				budova.pridajVozidlo(new Bicykel(nazovVozidla.getText()));
				break;
			case "Dod�vka" :
				budova.pridajVozidlo(new Dodavka(nazovVozidla.getText()));
				break;
			case "Kami�n" :
				budova.pridajVozidlo(new Kamion(nazovVozidla.getText()));
				break;
			case "Osobn� auto" :
				budova.pridajVozidlo(new OsobneAuto(nazovVozidla.getText()));
				break;
			}
		}
	}
}
