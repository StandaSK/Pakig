package controller;

import budovy.Budova;
import javafx.event.*;
import javafx.scene.control.TextArea;

/**
 * 
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public class VypisZasielokEventHandler implements EventHandler<ActionEvent> {
	private Budova budova;
	private TextArea vypis;

	public VypisZasielokEventHandler(Budova budova, TextArea vypis) {
		this.budova = budova;
		this.vypis = vypis;
	}

	@Override
	public void handle(ActionEvent arg0) {
		vypis.clear();
		budova.getZasielky().forEach(zasielka -> vypis.appendText("Typ: " + zasielka.getClass().getSimpleName() + 
				", Cieæ: " + zasielka.zistiCiel() + ", Hmotnosù: " + zasielka.zistiHmotnost() + "\n"));
	}

}
