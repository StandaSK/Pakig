package view;

import controller.*;
import budovy.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public class VyberPobockyView extends Stage {

	public VyberPobockyView() {
		this.setTitle("Výber poboèky - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label vyberPobocky = new Label("Vyberte poboèku:");
        grid.add(vyberPobocky, 0, 0);

        ComboBox<String> pobocky = new ComboBox<String>();
        ZoznamBudov.getPobocky().forEach(pobocka -> pobocky.getItems().add(pobocka.getNazov()));
        pobocky.setValue("-- Vyberte --");
        grid.add(pobocky, 1, 0);

        Button potvrdVyber = new Button("OK");
        grid.add(potvrdVyber, 2, 0);

        potvrdVyber.setOnAction(new VyberBudovyEventHandler(pobocky, 0));

        Button pridajPobocku = new Button("Pridaj poboèku");
        grid.add(pridajPobocku, 3, 0);

        pridajPobocku.setOnAction(new PridanieBudovyEventHandler(pobocky, 0));

		this.setScene(new Scene(grid, 500, 150));
		this.show();
	}

}
