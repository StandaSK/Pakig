package view;

import controller.PridanieBudovyEventHandler;
import budovy.ZoznamBudov;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VyberPobockyView extends Stage {

	public VyberPobockyView(ZoznamBudov zoznamBudov) {
		this.setTitle("Výber poboèky - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label vyberPobocky = new Label("Vyberte poboèku:");
        grid.add(vyberPobocky, 0, 0);

        ComboBox<String> pobocky = new ComboBox<String>();
        zoznamBudov.getPobocky().forEach(pobocka -> pobocky.getItems().add(pobocka.getNazov()));
        pobocky.setValue("-- Vyberte --");
        grid.add(pobocky, 1, 0);

        Button potvrdVyber = new Button("OK");
        grid.add(potvrdVyber, 2, 0);
        
        potvrdVyber.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("TEST");
				//Stage pb = new PobockaView(zoznamBudov.getPobocky().get(0));
				//pb.show();
			}
        	
        });

        potvrdVyber.setOnAction(null);

        Button pridajPobocku = new Button("Pridaj poboèku");
        grid.add(pridajPobocku, 3, 0);

        pridajPobocku.setOnAction(new PridanieBudovyEventHandler(zoznamBudov, pobocky, 0));

		this.setScene(new Scene(grid, 500, 150));
		this.show();
	}

}
