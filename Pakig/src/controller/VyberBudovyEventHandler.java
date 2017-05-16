package controller;

import budovy.*;
import view.*;
import javafx.event.*;
import javafx.scene.control.ComboBox;

/**
 * 
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public class VyberBudovyEventHandler implements EventHandler<ActionEvent> {
	private ComboBox<String> budovy;
	private int typ;

	/**
	 * Konštruktor pre EventHandler starajúci sa o vyber budovy
	 * @param budovy Sluzi na vyber nazvu (a nasledne najdenie) danej budovy
	 * @param typ 0 pre vyber poboèky, 1 pre vyber skladu
	 */
	public VyberBudovyEventHandler(ComboBox<String> budovy, int typ) {
		this.budovy = budovy;
		this.typ = typ;
	}

	@Override
	public void handle(ActionEvent arg0) {

		switch (typ) {
		case 0 :
			Pobocka vybranaPobocka = ZoznamBudov.najdiPobocku(budovy.getValue());
			new PobockaView(vybranaPobocka);
			break;
		case 1 :
			Sklad vybranySklad = ZoznamBudov.najdiSklad(budovy.getValue());
			new SkladView(vybranySklad);
			break;
		default :
			throw new IllegalStateException("Neexistujúci typ budovy!");
		}
	}

}
