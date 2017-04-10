package view;

import budovy.Budova;
import controller.PridanieVozidlaEventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PridanieVozidlaView extends Stage {

	public PridanieVozidlaView(Budova budova) {
		this.setTitle("Pridanie vozidla - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label typVozidlaLabel = new Label("Typ vozidla");
        grid.add(typVozidlaLabel, 0, 0);

        ComboBox<String> typVozidla = new ComboBox<String>();
        typVozidla.getItems().addAll("Bicykel", "Dod�vka", "Kami�n", "Osobn� auto");
        typVozidla.setValue("Dod�vka");
        grid.add(typVozidla, 1, 0);

        Label nazovVozidlaLabel = new Label("N�zov vozidla");
        grid.add(nazovVozidlaLabel, 0, 1);

        TextField nazovVozidla = new TextField();
        nazovVozidla.setPromptText("Zadajte n�zov vozidla");
        grid.add(nazovVozidla, 1, 1);

        Button pridajVozidlo = new Button("Pridaj vozidlo");
        grid.add(pridajVozidlo, 1, 4);

        pridajVozidlo.setOnAction(new PridanieVozidlaEventHandler(budova, typVozidla, nazovVozidla));

        Scene scene = new Scene(grid, 300, 250);
        this.setScene(scene);
        this.show();
	}

}
