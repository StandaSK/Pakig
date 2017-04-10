package view;

import controller.PridanieBudovyEventHandler;
import budovy.ZoznamBudov;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VyberSkladuView extends Stage {

	public VyberSkladuView(ZoznamBudov zoznamBudov) {
		this.setTitle("Výber skladu - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label vyberSkladu = new Label("Vyberte sklad:");
        grid.add(vyberSkladu, 0, 0);

        ComboBox<String> sklady = new ComboBox<String>();
        zoznamBudov.getSklady().forEach(sklad -> sklady.getItems().add(sklad.getNazov()));
        //sklady.getItems().add("Trnava");
        sklady.setValue("-- Vyberte --");
        grid.add(sklady, 1, 0);

        Button potvrdVyber = new Button("OK");
        grid.add(potvrdVyber, 2, 0);

        potvrdVyber.setOnAction(null);

        Button pridajSklad = new Button("Pridaj sklad");
        grid.add(pridajSklad, 3, 0);

        pridajSklad.setOnAction(new PridanieBudovyEventHandler(zoznamBudov, sklady, 1));

		this.setScene(new Scene(grid, 500, 275));
		this.show();
	}

}
