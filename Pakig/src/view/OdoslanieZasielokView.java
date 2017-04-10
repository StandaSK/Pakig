package view;

import budovy.Sklad;
import budovy.ZoznamBudov;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class OdoslanieZasielokView extends Stage {

	public OdoslanieZasielokView(Sklad sklad, ZoznamBudov zoznamBudov) {
		this.setTitle("Sklad " + sklad.getNazov() + " - Odosielanie zásielok - Pakig");

		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        /////////

        Scene scene = new Scene(grid, 300, 250);
        this.setScene(scene);
        this.show();
	}

}
