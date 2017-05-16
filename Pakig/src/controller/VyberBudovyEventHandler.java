package controller;

import budovy.*;
import view.*;
import javafx.event.*;
import javafx.scene.control.ComboBox;

/**
 * 
 * @author Stanislav Jakubek
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
			Pobocka vybranaPobocka;
			try {
				vybranaPobocka = ZoznamBudov.najdiPobocku(budovy.getValue());
				new PobockaView(vybranaPobocka);
			} catch (NeexistujucaBudovaException e1) {
				new ExceptionDialog(e1);
			}
			break;
		case 1 :
			Sklad vybranySklad;
			try {
				vybranySklad = ZoznamBudov.najdiSklad(budovy.getValue());
				new SkladView(vybranySklad);
			} catch (NeexistujucaBudovaException e) {
				new ExceptionDialog(e);
			}
			break;
		default :
			new ExceptionDialog(new IllegalStateException("Neexistujúci typ budovy!"));
		}
	}

}
