package controller;

import java.util.*;

import view.*;
import javafx.event.*;
import javafx.scene.control.*;

public class LoginEventHandler implements EventHandler<ActionEvent> {
	private TextField userTextField;
	private PasswordField passwordField;

	public LoginEventHandler(TextField userTextField, PasswordField passwordField) {
		this.userTextField = userTextField;
		this.passwordField = passwordField;
	}

	@Override
	public void handle(ActionEvent arg0) {

    	List<String> choices = new ArrayList<>();
    	choices.add("PoboËka");
    	choices.add("Sklad");

    	//TODO DokonËiù systÈm prihlasovania
    	System.out.println("Meno: " + userTextField.getText() + "\nHeslo: " + passwordField.getText());

    	ChoiceDialog<String> dialog = new ChoiceDialog<>("PoboËka", choices);
    	dialog.setTitle("V˝ber typu pracoviska - Pakig");
    	dialog.setHeaderText("Prihl·senie ˙speönÈ!");
    	dialog.setContentText("Vyberte typ pracoviska:");

    	Optional<String> result = dialog.showAndWait();
    	result.ifPresent(letter -> {

    		switch (letter) {
    		case "PoboËka" :
    	        new VyberPobockyView();
    			break;
    		case "Sklad" :
    			new VyberSkladuView();
    			break;
    		default :
    			throw new IllegalStateException("Nezn·my typ pracoviska!");
    		}
    	});
	}

}
