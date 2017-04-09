package view;

import controller.PridanieBudovyEventHandler;
import budovy.ZoznamBudov;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PobockaView extends Stage {

	public PobockaView(ZoznamBudov zoznamBudov) {
		this.setTitle("Pobo�ka - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label vyberPobocky = new Label("Vyberte pobo�ku:");
        grid.add(vyberPobocky, 0, 0);

        ComboBox<String> pobocky = new ComboBox<String>();
        pobocky.getItems().add("Bratislava");
        pobocky.getItems().add("Ko�ice");
        pobocky.setValue("-- Vyberte --");
        grid.add(pobocky, 1, 0);

        Button potvrdVyber = new Button("OK");
        grid.add(potvrdVyber, 2, 0);

        Button pridajPobocku = new Button("Pridaj pobo�ku");
        grid.add(pridajPobocku, 3, 0);
        
        pridajPobocku.setOnAction(new PridanieBudovyEventHandler(zoznamBudov, 0));

		this.setScene(new Scene(grid, 500, 150));

		this.show();
	}

}
