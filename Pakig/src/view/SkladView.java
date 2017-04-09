package view;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SkladView extends Stage {

	public SkladView() {
		this.setTitle("Sklad - Pakig");
		this.setScene(new Scene(new GridPane(), 450, 450));
		this.show();
	}

}
