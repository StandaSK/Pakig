package controller;

import javafx.event.*;

public class VyberBudovyEventHandler implements EventHandler<ActionEvent> {
	private int typ;

	public VyberBudovyEventHandler(int typ) {
		this.typ = typ;
	}

	@Override
	public void handle(ActionEvent arg0) {
		
		
		switch (typ) {
		case 0 :
			// Vybrana pobocka
			
			break;
		case 1 :
			// Vybrany sklad
			
			break;
		default :
			throw new IllegalStateException("Neexistujúci typ budovy!");
		}
	}

}
