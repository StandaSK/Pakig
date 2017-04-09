package view;

import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PobockaView extends Stage {

	public PobockaView() {
		this.setTitle("Poboèka - Pakig");
		
		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Label vyberPobocky = new Label("Vyberte poboèku:");
        grid.add(vyberPobocky, 0, 0);

        ComboBox<String> pobocky = new ComboBox<String>();
        pobocky.getItems().add("Bratislava");
        pobocky.getItems().add("Košice");
        pobocky.setValue("-- Vyberte --");
        grid.add(pobocky, 1, 0);

        Button pridajPobocku = new Button("Pridaj poboèku");
        grid.add(pridajPobocku, 2, 0);

		this.setScene(new Scene(grid, 500, 275));

		this.show();
	}

}
