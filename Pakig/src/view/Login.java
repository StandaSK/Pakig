package view;

// Importy modelu sl˙ûia len pre DEMO, neporuöuj˙ MVC
import budovy.ZoznamBudov;
import vozidla.*;
import zasielky.*;
import controller.*;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 * 
 * @author Stanislav Jakubek
 *
 */
public class Login extends Application {
	public final static boolean DEMO = true;

	public static void main(String[] args) {
		if (DEMO) {
			// Pridanie pobociek
			ZoznamBudov.pridajPobocku("Bratislava");
			ZoznamBudov.pridajPobocku("Koöice");
			ZoznamBudov.pridajSklad("Trnava");

			// Pridanie vozidiel budovam
			try {
				ZoznamBudov.najdiPobocku("Bratislava").pridajVozidlo(new Dodavka("Dod·vka BA-354CK"));
				ZoznamBudov.najdiPobocku("Bratislava").pridajVozidlo(new OsobneAuto("Os. Auto BL-617KF"));
				ZoznamBudov.najdiPobocku("Koöice").pridajVozidlo(new Dodavka("Dod·vka KE-445GD"));
				ZoznamBudov.najdiSklad("Trnava").pridajVozidlo(new Dodavka("Dod·vka TT-123AB"));
				ZoznamBudov.najdiSklad("Trnava").pridajVozidlo(new Dodavka("Dod·vka TT-789XY"));
				ZoznamBudov.najdiSklad("Trnava").pridajVozidlo(new Bicykel());

				// Vytvorenie demo zasiliek
				ArrayList<Zasielka> demoZasielky = new ArrayList<Zasielka>();
				demoZasielky.add(new Balik(0.4, "Bratislava"));
				demoZasielky.add(new List(1, "Koöice"));

				// Priradenie demo zasiliek skladu
				ZoznamBudov.najdiSklad("Trnava").prijmiZasielky(demoZasielky);
			} catch (NeexistujucaBudovaException e) {
				new ExceptionDialog(e);
			}
		}
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
        userTextField.setPromptText("Zadajte meno");
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Heslo:");
        grid.add(pw, 0, 2);

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Zadajte heslo");
        grid.add(passwordField, 1, 2);

        Button btn = new Button("Prihl·siù");
        HBox hbBtn = new HBox(10);

        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        btn.setOnAction(new LoginEventHandler(userTextField, passwordField));

        Scene scene = new Scene(grid, 300, 250);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

}
