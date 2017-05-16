package controller;

import java.util.Iterator;
import zasielky.Zasielka;
import budovy.Pobocka;
import javafx.event.*;

/**
 * 
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public class OdovzdajZasielkyEventHandler implements EventHandler<ActionEvent> {
	Pobocka pobocka;

	public OdovzdajZasielkyEventHandler(Pobocka pobocka) {
		this.pobocka = pobocka;
	}

	@Override
	public void handle(ActionEvent arg0) {
		String nazov = this.pobocka.getNazov();

		Iterator<Zasielka> iterator = pobocka.getZasielky().iterator();

		while (iterator.hasNext()) {
			Zasielka zasielka = iterator.next();

		    if (zasielka.zistiCiel().equals(nazov))
		        iterator.remove();
		}
	}

}
