package controller;

import view.PridanieVozidlaView;
import budovy.Budova;
import javafx.event.*;

/**
 * 
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public class OtvorPridanieVozidlaEventHandler implements EventHandler<ActionEvent> {
	private Budova budova;

	public OtvorPridanieVozidlaEventHandler(Budova budova) {
		this.budova = budova;
	}

	@Override
	public void handle(ActionEvent arg0) {
		new PridanieVozidlaView(budova);
	}

}
