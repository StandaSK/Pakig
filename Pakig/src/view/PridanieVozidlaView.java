package view;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import budovy.Budova;

public class PridanieVozidlaView extends Stage {

	public PridanieVozidlaView(Budova budova) {
		this.setTitle("Pridanie vozidla - Pakig");
		
		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Label typVozidlaLabel = new Label("Typ vozidla");
        grid.add(typVozidlaLabel, 0, 0);
        
        ComboBox<String> typVozidla = new ComboBox<String>();
        typVozidla.getItems().add("Dodavka");
        grid.add(typVozidla, 1, 0);
        
        Label nazovVozidlaLabel = new Label("Nazov vozidla");
        grid.add(nazovVozidlaLabel, 0, 1);
        
        TextField nazovVozidla = new TextField();
        grid.add(nazovVozidla, 1, 1);
        
        Button pridajVozidlo = new Button("Pridaj vozidlo");
        grid.add(pridajVozidlo, 1, 4);
	}

}
