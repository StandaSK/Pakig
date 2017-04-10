package view;

import budovy.Sklad;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SkladView extends Stage {

	public SkladView(Sklad sklad) {
		this.setTitle("Sklad " + sklad.getNazov() + " - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Button pridajVozidlo = new Button("Pridaj vozidlo");
        grid.add(pridajVozidlo, 0, 0);
        
        Scene scene = new Scene(grid, 300, 250);
        this.setScene(scene);
        this.show();
	}

}
