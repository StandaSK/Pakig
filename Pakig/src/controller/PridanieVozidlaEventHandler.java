package controller;

import view.PridanieVozidlaView;
import budovy.Budova;
import javafx.event.*;

public class PridanieVozidlaEventHandler implements EventHandler<ActionEvent> {
	private Budova budova;
	
	public PridanieVozidlaEventHandler(Budova budova) {
		this.budova = budova;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		new PridanieVozidlaView(budova);
	}

}
