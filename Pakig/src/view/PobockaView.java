package view;

import budovy.Pobocka;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PobockaView extends Stage {

	public PobockaView(Pobocka pobocka) {
		this.setTitle("Poboèka " + pobocka.getNazov() + " - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Button pridajVozidlo = new Button("Pridaj vozidlo");
        grid.add(pridajVozidlo, 0, 0);
        
        pridajVozidlo.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				new PridanieVozidlaView(pobocka);
			}
        	
        });

        Button novaZasielka = new Button("Nová zásielka");
        grid.add(novaZasielka, 0, 1);
        
        Scene scene = new Scene(grid, 300, 250);
        this.setScene(scene);
        this.show();
	}

}
