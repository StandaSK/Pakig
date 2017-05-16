package view;

import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import budovy.*;
import controller.PridanieZasielkyEventHandler;

/**
 * 
 * @author Stanislav Jakubek
 *
 */
public class PridanieZasielkyView extends Stage {

	public PridanieZasielkyView(Pobocka pobocka) {
		this.setTitle("Pridanie z·sielky - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Nov· z·sielka");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label typZasielkyLabel = new Label("Typ z·sielky");
        grid.add(typZasielkyLabel, 0, 1);

        ComboBox<String> typZasielky = new ComboBox<String>();
        typZasielky.getItems().addAll("BalÌk", "List");
        typZasielky.setValue("List");
        grid.add(typZasielky, 1, 1);

        Label cielZasielkyLabel = new Label("Cieæ z·sielky");
        grid.add(cielZasielkyLabel, 0, 2);

        ComboBox<String> cielZasielky = new ComboBox<String>();
        cielZasielky.setValue("-- Vyberte --");
        ZoznamBudov.getPobocky().forEach(p -> cielZasielky.getItems().add(p.getNazov()));
        grid.add(cielZasielky, 1, 2);

        Label hmotnostZasielkyLabel = new Label("Hmotnosù (kg)");
        grid.add(hmotnostZasielkyLabel, 0, 3);

        TextField hmotnostZasielky = new TextField();
        hmotnostZasielky.setPromptText("Zadajte hmotnosù z·sielky");
        grid.add(hmotnostZasielky, 1, 3);

        Button pridajZasielku = new Button("Pridaj z·sielku");
        HBox hbBtn = new HBox(10);

        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(pridajZasielku);
        grid.add(hbBtn, 1, 4);

        pridajZasielku.setOnAction(new PridanieZasielkyEventHandler(
        		pobocka, typZasielky, cielZasielky, hmotnostZasielky));

        Scene scene = new Scene(grid, 300, 250);
        this.setScene(scene);
        this.show();
	}

}