package controller;

import zasielky.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import budovy.Pobocka;

public class PridanieZasielkyEventHandler implements EventHandler<ActionEvent> {
	private Pobocka pobocka;
	private ComboBox<String> typZasielky;
	private TextField cielZasielky;
	private TextField hmotnostZasielky;

	public PridanieZasielkyEventHandler(Pobocka pobocka, ComboBox<String> typZasielky, TextField cielZasielky, TextField hmotnostZasielky) {
		this.pobocka = pobocka;
		this.typZasielky = typZasielky;
		this.cielZasielky = cielZasielky;
		this.hmotnostZasielky = hmotnostZasielky;
	}

	@Override
	public void handle(ActionEvent arg0) {
		String tz = typZasielky.getValue();
		String cz = cielZasielky.getText();
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
