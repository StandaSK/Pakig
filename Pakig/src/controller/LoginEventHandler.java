package controller;

import java.util.*;
import view.*;
import javafx.event.*;
import javafx.scene.control.*;

/**
 * 
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
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
    	choices.add("Poboèka");
    	choices.add("Sklad");

    	System.out.println("Meno: " + userTextField.getText() + "\nHeslo: " + passwordField.getText());

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
