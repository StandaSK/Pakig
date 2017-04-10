package controller;

import budovy.*;
import view.*;
import javafx.event.*;
import javafx.scene.control.ComboBox;

public class VyberBudovyEventHandler implements EventHandler<ActionEvent> {
	private ZoznamBudov zoznamBudov;
	private ComboBox<String> budovy;
	private int typ;

	public VyberBudovyEventHandler(ZoznamBudov zoznamBudov, ComboBox<String> budovy, int typ) {
		this.zoznamBudov = zoznamBudov;
		this.budovy = budovy;
		this.typ = typ;
	}

	@Override
	public void handle(ActionEvent arg0) {
		
		
		switch (typ) {
		case 0 :
			// Vybrana pobocka
			Pobocka vybranaPobocka = zoznamBudov.najdiPobocku(budovy.getValue());
			
			new PobockaView(vybranaPobocka);
			break;
		case 1 :
			// Vybrany sklad
			Sklad vybranySklad = zoznamBudov.najdiSklad(budovy.getValue());
			
			new SkladView(vybranySklad);
			break;
		default :
			throw new IllegalStateException("Neexistujúci typ budovy!");
		}
	}

}
