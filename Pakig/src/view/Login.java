package view;

import controller.*;
import budovy.*;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class Login extends Application {
	private ZoznamBudov zoznamBudov = new ZoznamBudov();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
    public void start(Stage primaryStage) {
		
        primaryStage.setTitle("Prihl·senie - Pakig");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Vitajte");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("Meno:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Heslo:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        // Pomocne zobrazenie GridPane
        //grid.setGridLinesVisible(true);

        Button btn = new Button("Prihl·siù");
        HBox hbBtn = new HBox(10);

        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        btn.setOnAction(new LoginEventHandler(zoznamBudov));

        Scene scene = new Scene(grid, 300, 250);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

}
