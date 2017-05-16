package view;

import controller.OdoslanieZasielokEventHandler;
import budovy.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 
 * @author Stanislav Jakubek
 *
 */
public class OdoslanieZasielokView extends Stage {

	public OdoslanieZasielokView(Sklad sklad) {
		this.setTitle("Sklad " + sklad.getNazov() + " - Odosielanie zásielok - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label vyberPobockyLabel = new Label("Vyber poboèku");
        grid.add(vyberPobockyLabel, 0, 0);

        ComboBox<String> vyberPobocky = new ComboBox<String>();
        vyberPobocky.setValue("-- Vyberte --");
        ZoznamBudov.getPobocky().forEach(pobocka -> vyberPobocky.getItems().add(pobocka.getNazov()));
        grid.add(vyberPobocky, 1, 0);

        Label vyberVozidlaLabel = new Label("Vyber vozidlo");
        grid.add(vyberVozidlaLabel, 0, 1);

        ComboBox<String> vyberVozidla = new ComboBox<String>();
        vyberVozidla.setValue("-- Vyberte --");
        sklad.getVozidla().forEach(vozidlo -> vyberVozidla.getItems().add(vozidlo.getNazov()));
        grid.add(vyberVozidla, 1, 1);

        Button posliVozidlo = new Button("Pošli vozidlo");
        grid.add(posliVozidlo, 1, 3);

        posliVozidlo.setOnAction(new OdoslanieZasielokEventHandler(sklad, vyberPobocky, vyberVozidla));

        Scene scene = new Scene(grid, 300, 250);
        this.setScene(scene);
        this.show();
	}

}
