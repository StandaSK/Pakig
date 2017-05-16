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
	private TextArea vozidlaVypis;

	public VypisVozidielEventHandler(Budova budova, TextArea vozidlaVypis) {
		this.budova = budova;
		this.vozidlaVypis = vozidlaVypis;
	}

	@Override
	public void handle(ActionEvent arg0) {
		vozidlaVypis.clear();
		budova.getVozidla().forEach(vozidlo -> vozidlaVypis.appendText(vozidlo.getNazov() + "\n"));
	}

}
