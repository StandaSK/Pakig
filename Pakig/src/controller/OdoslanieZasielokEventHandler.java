package controller;

import view.ExceptionDialog;
import vozidla.Vozidlo;
import budovy.*;
import javafx.event.*;
import javafx.scene.control.*;

/**
 * 
 * @author Stanislav Jakubek
 *
 */
public class OdoslanieZasielokEventHandler implements EventHandler<ActionEvent> {
	private Sklad sklad;
	private ComboBox<String> vyberPobocky;
	private ComboBox<String> vyberVozidla;

	public OdoslanieZasielokEventHandler(Sklad sklad, ComboBox<String> vyberPobocky, ComboBox<String> vyberVozidla) {
		this.sklad = sklad;
		this.vyberPobocky = vyberPobocky;
		this.vyberVozidla = vyberVozidla;
	}

	@Override
	public void handle(ActionEvent arg0) {
		try {
			Vozidlo vybraneVozidlo = sklad.getVozidlo(vyberVozidla.getValue());
			String nazovVybranejPobocky = vyberPobocky.getValue();
			Pobocka vybranaPobocka = ZoznamBudov.najdiPobocku(nazovVybranejPobocky);
			sklad.odovzdajZasielky(vybraneVozidlo, nazovVybranejPobocky);
			vybraneVozidlo.odovzdajZasielky(vybranaPobocka);
			sklad.prijmiZasielky(vybraneVozidlo.getZasielky());
		} catch (NeexistujucaBudovaException e) {
			new ExceptionDialog(e);
		}
		catch (NeexistujuceVozidloException e1) {
			new ExceptionDialog(e1);
		}
	}

}
