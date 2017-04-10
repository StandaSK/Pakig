package view;

import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import budovy.Pobocka;
import controller.PridanieZasielkyEventHandler;

public class PridanieZasielkyView extends Stage {

	public PridanieZasielkyView(Pobocka pobocka) {
		this.setTitle("Pridanie z·sielky - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label typZasielkyLabel = new Label("Typ z·sielky");
        grid.add(typZasielkyLabel, 0, 0);

        ComboBox<String> typZasielky = new ComboBox<String>();
        typZasielky.getItems().addAll("BalÌk", "List");
        typZasielky.setValue("List");
        grid.add(typZasielky, 1, 0);

        Label cielZasielkyLabel = new Label("Cieæ z·sielky");
        grid.add(cielZasielkyLabel, 0, 1);

        TextField cielZasielky = new TextField();
        cielZasielky.setPromptText("Zadajte cieæ z·sielky");
        grid.add(cielZasielky, 1, 1);

        Label hmotnostZasielkyLabel = new Label("Hmotnosù z·sielky");
        grid.add(hmotnostZasielkyLabel, 0, 2);

        TextField hmotnostZasielky = new TextField();
        hmotnostZasielky.setPromptText("Zadajte hmotnosù z·sielky");
        grid.add(hmotnostZasielky, 1, 2);

        Button pridajZasielku = new Button("Pridaj z·sielku");
        grid.add(pridajZasielku, 1, 4);

        pridajZasielku.setOnAction(new PridanieZasielkyEventHandler(
        		pobocka, typZasielky, cielZasielky, hmotnostZasielky));

        Scene scene = new Scene(grid, 300, 250);
        this.setScene(scene);
        this.show();
	}

}