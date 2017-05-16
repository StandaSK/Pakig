package view;

import controller.*;
import budovy.Pobocka;
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
public class PobockaView extends Stage {

	public PobockaView(Pobocka pobocka) {
		this.setTitle("Poboèka " + pobocka.getNazov() + " - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        TextArea vypis = new TextArea();
        vypis.setEditable(false);
        vypis.setWrapText(true);
        grid.add(vypis, 1, 0, 2, 6);

        Button pridajVozidlo = new Button("Pridaj vozidlo");
        grid.add(pridajVozidlo, 0, 0);

        pridajVozidlo.setOnAction(new OtvorPridanieVozidlaEventHandler(pobocka));

        Button novaZasielka = new Button("Nová zásielka");
        grid.add(novaZasielka, 0, 1);

        novaZasielka.setOnAction(new OtvorPridanieZasielkyEventHandler(pobocka));

        Button odovzdajZasielku = new Button("Odovzdaj zásielky");
        grid.add(odovzdajZasielku, 0, 2);

        odovzdajZasielku.setOnAction(new OdovzdajZasielkyEventHandler(pobocka));

        Button vypisVozidla = new Button("Vypíš vozidlá");
        grid.add(vypisVozidla, 0, 3);

        vypisVozidla.setOnAction(new VypisVozidielEventHandler(pobocka, vypis));

        Button vypisZasielky = new Button("Vypíš zásielky");
        grid.add(vypisZasielky, 0, 4);

        vypisZasielky.setOnAction(new VypisZasielokEventHandler(pobocka, vypis));

        Scene scene = new Scene(grid, 300, 250);
        this.setScene(scene);
        this.show();
	}

}
