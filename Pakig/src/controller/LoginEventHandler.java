package controller;

import java.util.*;
import budovy.*;
import view.*;
import javafx.event.*;
import javafx.scene.control.*;


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

    	//ChoiceDialog<String> dialog = new ChoiceDialog<>("-- Vyberte --", choices);
    	ChoiceDialog<String> dialog = new ChoiceDialog<>("Pobo�ka", choices);
    	dialog.setTitle("V�ber typu pracoviska - Pakig");
    	dialog.setHeaderText("Prihl�senie �spe�n�!");
    	dialog.setContentText("Vyberte typ pracoviska:");

    	Optional<String> result = dialog.showAndWait();
    	result.ifPresent(letter -> {
    		System.out.println("Va�a vo�ba: " + letter);
    		
    		switch (letter) {
    		case "Pobo�ka" :
    	        new VyberPobockyView(zoznamBudov);
    			break;
    		case "Sklad" :
    			new VyberSkladuView(zoznamBudov);
    			break;
    		default :
    			throw new IllegalStateException("Nezn�my typ pracoviska!");
    		}
    	});
	}

}
