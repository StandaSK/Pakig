package controller;

import view.PridanieZasielkyView;
import budovy.Pobocka;
import javafx.event.*;

public class OtvorPridanieZasielkyEventHandler implements EventHandler<ActionEvent> {
	private Pobocka pobocka;

	public OtvorPridanieZasielkyEventHandler(Pobocka pobocka) {
		this.pobocka = pobocka;
	}

	@Override
	public void handle(ActionEvent arg0) {
		new PridanieZasielkyView(pobocka);
	}

}
