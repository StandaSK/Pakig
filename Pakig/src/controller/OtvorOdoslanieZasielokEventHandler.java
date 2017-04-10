package controller;

import view.OdoslanieZasielokView;
import budovy.Sklad;
import budovy.ZoznamBudov;
import javafx.event.*;

public class OtvorOdoslanieZasielokEventHandler implements EventHandler<ActionEvent> {
	private Sklad sklad;
	private ZoznamBudov zoznamBudov;

	public OtvorOdoslanieZasielokEventHandler(Sklad sklad, ZoznamBudov zoznamBudov) {
		this.sklad = sklad;
		this.zoznamBudov = zoznamBudov;
	}

	@Override
	public void handle(ActionEvent arg0) {
		new OdoslanieZasielokView(sklad, zoznamBudov);
	}

}
