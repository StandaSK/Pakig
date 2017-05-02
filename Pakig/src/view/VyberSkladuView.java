package view;

import controller.*;
import budovy.ZoznamBudov;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VyberSkladuView extends Stage {

	public VyberSkladuView() {
		this.setTitle("Výber skladu - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label vyberSkladu = new Label("Vyberte sklad:");
        grid.add(vyberSkladu, 0, 0);

        ComboBox<String> sklady = new ComboBox<String>();
        ZoznamBudov.getSklady().forEach(sklad -> sklady.getItems().add(sklad.getNazov()));
        sklady.setValue("-- Vyberte --");
        grid.add(sklady, 1, 0);

        Button potvrdVyber = new Button("OK");
        grid.add(potvrdVyber, 2, 0);

        potvrdVyber.setOnAction(new VyberBudovyEventHandler(sklady, 1));

        Button pridajSklad = new Button("Pridaj sklad");
        grid.add(pridajSklad, 3, 0);

        pridajSklad.setOnAction(new PridanieBudovyEventHandler(sklady, 1));

		this.setScene(new Scene(grid, 500, 150));
		this.show();
	}

}
