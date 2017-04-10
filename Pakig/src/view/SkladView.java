package view;

import controller.*;
import budovy.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SkladView extends Stage {

	public SkladView(Sklad sklad, ZoznamBudov zoznamBudov) {
		this.setTitle("Sklad " + sklad.getNazov() + " - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Button pridajVozidlo = new Button("Pridaj vozidlo");
        grid.add(pridajVozidlo, 0, 0);

        pridajVozidlo.setOnAction(new OtvorPridanieVozidlaEventHandler(sklad));

        Button odosliZasielky = new Button("Odo�li z�sielky");
        grid.add(odosliZasielky, 0, 1);

        odosliZasielky.setOnAction(new OtvorOdoslanieZasielokEventHandler(sklad, zoznamBudov));

        TextArea vozidlaVypis = new TextArea();
        sklad.getVozidla().forEach(vozidlo -> vozidlaVypis.appendText(vozidlo.getNazov() + "\n"));
        vozidlaVypis.setEditable(false);
        grid.add(vozidlaVypis, 1, 0, 2, 6);

        Scene scene = new Scene(grid, 300, 250);
        this.setScene(scene);
        this.show();
	}

}
