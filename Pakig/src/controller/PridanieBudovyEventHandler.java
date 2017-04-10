package controller;

import java.util.Optional;

import budovy.ZoznamBudov;
import javafx.event.*;
import javafx.scene.control.*;

public class PridanieBudovyEventHandler implements EventHandler<ActionEvent> {
	private ZoznamBudov zoznamBudov;
	private ComboBox<String> budovy;
	private int typ;
	
	/**
	 * Kon�truktor pre EventHandler staraj�ci sa o pridanie novej budovy
	 * @param zoznamBudov Zoznam v�etk�ch budov
	 * @param typ 0 pre vytvorenie pobo�ky, 1 pre vytvorenie skladu
	 */
	public PridanieBudovyEventHandler(ZoznamBudov zoznamBudov, ComboBox<String> budovy, int typ) {
		this.zoznamBudov = zoznamBudov;
		this.budovy = budovy;
		this.typ = typ;
	}

	@Override
	public void handle(ActionEvent arg0) {
		TextInputDialog dialog = new TextInputDialog();
		
		switch (typ) {
		case 0 :
			dialog.setTitle("Pridanie pobo�ky - Pakig");
			dialog.setHeaderText("Zadajte n�zov novej pobo�ky: ");
			break;
		case 1 :
			dialog.setTitle("Pridanie skladu - Pakig");
			dialog.setHeaderText("Zadajte n�zov nov�ho skladu: ");
			break;
		default :
			throw new IllegalStateException("Neexistuj�ci typ budovy!");
		}
		
		Optional<String> result = dialog.showAndWait();
		
		result.ifPresent(text -> {
			switch (typ) {
			case 0 :
				System.out.println("Vytv�ram nov� pobo�ku: " + text);
				
				zoznamBudov.pridajPobocku(text);
				break;
			case 1 :
				System.out.println("Vytv�ram nov� sklad: " + text);
				
				zoznamBudov.pridajSklad(text);
				break;
			default :
				throw new IllegalStateException("Neexistuj�ci typ budovy!");
			}
			
			// TODO Prerobit pridavanie do ComboBoxu cez Observer
			budovy.getItems().add(text);
		});
	}

}