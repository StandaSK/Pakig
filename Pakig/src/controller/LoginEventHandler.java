package controller;

import java.util.*;
import budovy.*;
import view.*;
import javafx.application.Platform;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;


public class LoginEventHandler implements EventHandler<ActionEvent> {
	private ZoznamBudov zoznamBudov;

	public LoginEventHandler(ZoznamBudov zoznamBudov) {
		this.zoznamBudov = zoznamBudov;
	}

	@Override
	public void handle(ActionEvent arg0) {

    	List<String> choices = new ArrayList<>();
    	choices.add("Poboèka");
    	choices.add("Sklad");

    	//ChoiceDialog<String> dialog = new ChoiceDialog<>("-- Vyberte --", choices);
    	ChoiceDialog<String> dialog = new ChoiceDialog<>("Poboèka", choices);
    	dialog.setTitle("Výber typu pracoviska - Pakig");
    	dialog.setHeaderText("Prihlásenie úspešné!");
    	dialog.setContentText("Vyberte typ pracoviska:");

    	Optional<String> result = dialog.showAndWait();
    	result.ifPresent(letter -> {
    		System.out.println("Vaša vo¾ba: " + letter);
    		
    		switch (letter) {
    		case "Poboèka" :
    	        new VyberPobockyView(zoznamBudov);
    			break;
    		case "Sklad" :
    			new VyberSkladuView(zoznamBudov);
    			break;
    		default :
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setTitle("Chyba! - Pakig");
    			alert.setHeaderText("Chyba!");
    			alert.setContentText("Nevybrali ste typ pracoviska!");
    			alert.showAndWait();
    			Platform.exit();
    			
    			// Riesenie pomocou vyhodenia vynimky
    			//throw new IllegalStateException("Nevybrali ste správny typ pracoviska!");
    		}
    	});
	}

}
