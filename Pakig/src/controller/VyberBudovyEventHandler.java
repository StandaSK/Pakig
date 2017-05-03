package controller;

import budovy.*;
import view.*;
import javafx.event.*;
import javafx.scene.control.ComboBox;

public class VyberBudovyEventHandler implements EventHandler<ActionEvent> {
	private ComboBox<String> budovy;
	private int typ;

	public VyberBudovyEventHandler(ComboBox<String> budovy, int typ) {
		this.budovy = budovy;
		this.typ = typ;
	}

	@Override
	public void handle(ActionEvent arg0) {

		switch (typ) {
		case 0 :
			// Vybraná poboèka
			Pobocka vybranaPobocka = ZoznamBudov.najdiPobocku(budovy.getValue());
			new PobockaView(vybranaPobocka);
			break;
		case 1 :
			// Vybraný sklad
			Sklad vybranySklad = ZoznamBudov.najdiSklad(budovy.getValue());
			new SkladView(vybranySklad);
			break;
		default :
			throw new IllegalStateException("Neexistujúci typ budovy!");
		}
	}

}
