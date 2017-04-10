package controller;

import budovy.Pobocka;
import javafx.event.*;

public class OdovzdajZasielkuEventHandler implements EventHandler<ActionEvent> {
	Pobocka pobocka;

	public OdovzdajZasielkuEventHandler(Pobocka pobocka) {
		this.pobocka = pobocka;
	}

	@Override
	public void handle(ActionEvent arg0) {
		String nazov = this.pobocka.getNazov();
		
		pobocka.getZasielky().forEach(zasielka -> {
			if (zasielka.zistiCiel().equals(nazov)) {
				pobocka.getZasielky().remove(zasielka);
			}
		});
	}

}
