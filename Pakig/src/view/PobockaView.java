package view;

import controller.*;
import budovy.Pobocka;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PobockaView extends Stage {

	public PobockaView(Pobocka pobocka) {
		this.setTitle("Pobo�ka " + pobocka.getNazov() + " - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        TextArea vypis = new TextArea();
        vypis.setEditable(false);
        grid.add(vypis, 1, 0, 2, 6);

        Button pridajVozidlo = new Button("Pridaj vozidlo");
        grid.add(pridajVozidlo, 0, 0);

        pridajVozidlo.setOnAction(new OtvorPridanieVozidlaEventHandler(pobocka));

        Button novaZasielka = new Button("Nov� z�sielka");
        grid.add(novaZasielka, 0, 1);

        novaZasielka.setOnAction(new OtvorPridanieZasielkyEventHandler(pobocka));

        // TODO Odoberanie jednotlivych zasielok
        Button odovzdajZasielku = new Button("Odovzdaj z�sielku");
        grid.add(odovzdajZasielku, 0, 2);

        odovzdajZasielku.setOnAction(new OdovzdajZasielkuEventHandler(pobocka));

        Button vypisVozidla = new Button("Vyp� vozidl�");
        grid.add(vypisVozidla, 0, 3);

        vypisVozidla.setOnAction(new VypisVozidielEventHandler(pobocka, vypis));

        Button vypisZasielky = new Button("Vyp� z�sielky");
        grid.add(vypisZasielky, 0, 4);

        vypisZasielky.setOnAction(new VypisZasielokEventHandler(pobocka, vypis));

        Scene scene = new Scene(grid, 300, 250);
        this.setScene(scene);
        this.show();
	}

}
