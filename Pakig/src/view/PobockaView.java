package view;

import controller.*;
import budovy.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PobockaView extends Stage {

	public PobockaView(Pobocka pobocka, ZoznamBudov zoznamBudov) {
		this.setTitle("Poboèka " + pobocka.getNazov() + " - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Button pridajVozidlo = new Button("Pridaj vozidlo");
        grid.add(pridajVozidlo, 0, 0);

        pridajVozidlo.setOnAction(new OtvorPridanieVozidlaEventHandler(pobocka));

        Button novaZasielka = new Button("Nová zásielka");
        grid.add(novaZasielka, 0, 1);

        novaZasielka.setOnAction(new OtvorPridanieZasielkyEventHandler(pobocka));

        // TODO Odoberanie jednotlivych zasielok
        Button odovzdajZasielku = new Button("Odovzdaj zásielku");
        grid.add(odovzdajZasielku, 0, 2);

        odovzdajZasielku.setOnAction(new OdovzdajZasielkuEventHandler(pobocka));

        TextArea vozidlaVypis = new TextArea();
        pobocka.getVozidla().forEach(vozidlo -> vozidlaVypis.appendText(vozidlo.getNazov() + "\n"));
        vozidlaVypis.setEditable(false);
        grid.add(vozidlaVypis, 1, 0, 2, 6);

        Scene scene = new Scene(grid, 300, 250);
        this.setScene(scene);
        this.show();
	}

}
