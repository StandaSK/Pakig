package controller;

import budovy.Budova;
import javafx.event.*;
import javafx.scene.control.TextArea;

/**
 * 
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public class VypisVozidielEventHandler implements EventHandler<ActionEvent> {
	private Budova budova;
	private TextArea vypis;

	public VypisVozidielEventHandler(Budova budova, TextArea vypis) {
		this.budova = budova;
		this.vypis = vypis;
	}

	@Override
	public void handle(ActionEvent arg0) {
		vypis.clear();
		budova.getVozidla().forEach(vozidlo -> vypis.appendText(vozidlo.getNazov() + "\n"));
	}

}
