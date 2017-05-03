package controller;

import java.util.*;
import view.*;
import javafx.event.*;
import javafx.scene.control.*;


public class LoginEventHandler implements EventHandler<ActionEvent> {

	public LoginEventHandler() {
		
	}

	@Override
	public void handle(ActionEvent arg0) {

    	List<String> choices = new ArrayList<>();
    	choices.add("Poboèka");
    	choices.add("Sklad");

    	ChoiceDialog<String> dialog = new ChoiceDialog<>("Poboèka", choices);
    	dialog.setTitle("Výber typu pracoviska - Pakig");
    	dialog.setHeaderText("Prihlásenie úspešné!");
    	dialog.setContentText("Vyberte typ pracoviska:");

    	Optional<String> result = dialog.showAndWait();
    	result.ifPresent(letter -> {

    		switch (letter) {
    		case "Poboèka" :
    	        new VyberPobockyView();
    			break;
    		case "Sklad" :
    			new VyberSkladuView();
    			break;
    		default :
    			throw new IllegalStateException("Neznámy typ pracoviska!");
    		}
    	});
	}

}
