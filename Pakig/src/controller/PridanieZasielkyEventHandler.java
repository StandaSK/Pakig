package controller;

import zasielky.*;
import javafx.event.*;
import javafx.scene.control.*;
import budovy.Pobocka;

/**
 * 
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public class PridanieZasielkyEventHandler implements EventHandler<ActionEvent> {
	private Pobocka pobocka;
	private ComboBox<String> typZasielky;
	private ComboBox<String> cielZasielky;
	private TextField hmotnostZasielky;

	public PridanieZasielkyEventHandler(Pobocka pobocka, ComboBox<String> typZasielky, ComboBox<String> cielZasielky, TextField hmotnostZasielky) {
		this.pobocka = pobocka;
		this.typZasielky = typZasielky;
		this.cielZasielky = cielZasielky;
		this.hmotnostZasielky = hmotnostZasielky;
	}

	@Override
	public void handle(ActionEvent arg0) {
		String tz = typZasielky.getValue();
		String cz = cielZasielky.getValue();
		double hz = Double.parseDouble(hmotnostZasielky.getText());

		switch (tz) {
		case "Balík" :
			this.pobocka.pridajZasielku(new Balik(hz, cz));
			break;
		case "List" :
			this.pobocka.pridajZasielku(new List(hz, cz));
			break;
		}
	}

}
