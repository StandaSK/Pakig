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
    	choices.add("Pobo�ka");
    	choices.add("Sklad");

    	ChoiceDialog<String> dialog = new ChoiceDialog<>("-- Vyberte --", choices);
    	dialog.setTitle("V�ber pracoviska - Pakig");
    	dialog.setHeaderText("Prihl�senie �spe�n�!");
    	dialog.setContentText("Vyberte typ pracoviska:");

    	Optional<String> result = dialog.showAndWait();
    	result.ifPresent(letter -> {
    		System.out.println("Va�a vo�ba: " + letter);
    		
    		switch (letter) {
    		case "Pobo�ka" :
    	        new PobockaView();
    			break;
    		case "Sklad" :
    			new SkladView();
    			break;
    		default :
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setTitle("Chyba! - Pakig");
    			alert.setHeaderText("Chyba!");
    			alert.setContentText("Nevybrali ste typ pracoviska!");

    			alert.showAndWait();
    			Platform.exit();
    		}
    	});
	}

}
