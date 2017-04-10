package view;

import budovy.Budova;
import controller.PridanieVozidlaEventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class PridanieVozidlaView extends Stage {

	public PridanieVozidlaView(Budova budova) {
		this.setTitle("Pridanie vozidla - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Nové vozidlo");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label typVozidlaLabel = new Label("Typ vozidla");
        grid.add(typVozidlaLabel, 0, 1);

        ComboBox<String> typVozidla = new ComboBox<String>();
        typVozidla.getItems().addAll("Bicykel", "Dodávka", "Kamión", "Osobné auto");
        typVozidla.setValue("Dodávka");
        grid.add(typVozidla, 1, 1);

        Label nazovVozidlaLabel = new Label("Názov vozidla");
        grid.add(nazovVozidlaLabel, 0, 2);

        TextField nazovVozidla = new TextField();
        nazovVozidla.setPromptText("Zadajte názov vozidla");
        grid.add(nazovVozidla, 1, 2);

        Button pridajVozidlo = new Button("Pridaj vozidlo");
        HBox hbBtn = new HBox(10);

        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(pridajVozidlo);
        grid.add(hbBtn, 1, 3);

        pridajVozidlo.setOnAction(new PridanieVozidlaEventHandler(budova, typVozidla, nazovVozidla));

        Scene scene = new Scene(grid, 300, 250);
        this.setScene(scene);
        this.show();
	}

}
