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
    	choices.add("Pobo�ka");
    	choices.add("Sklad");

    	ChoiceDialog<String> dialog = new ChoiceDialog<>("Pobo�ka", choices);
    	dialog.setTitle("V�ber typu pracoviska - Pakig");
    	dialog.setHeaderText("Prihl�senie �spe�n�!");
    	dialog.setContentText("Vyberte typ pracoviska:");

    	Optional<String> result = dialog.showAndWait();
    	result.ifPresent(letter -> {

    		switch (letter) {
    		case "Pobo�ka" :
    	        new VyberPobockyView();
    			break;
    		case "Sklad" :
    			new VyberSkladuView();
    			break;
    		default :
    			throw new IllegalStateException("Nezn�my typ pracoviska!");
    		}
    	});
	}

}
