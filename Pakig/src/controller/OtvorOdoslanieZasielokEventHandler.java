package controller;

import view.OdoslanieZasielokView;
import budovy.Sklad;
import javafx.event.*;

public class OtvorOdoslanieZasielokEventHandler implements EventHandler<ActionEvent> {
	private Sklad sklad;

	public OtvorOdoslanieZasielokEventHandler(Sklad sklad) {
		this.sklad = sklad;
	}

	@Override
	public void handle(ActionEvent arg0) {
		new OdoslanieZasielokView(sklad);
	}

}
