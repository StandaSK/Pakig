package view;

import java.util.*;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 * Zdroj: http://docs.oracle.com/javafx/2/get_started/jfxpub-get_started.htm
 */
public class Login extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public Login() {
		// TODO Auto-generated constructor stub
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
        //grid.setGridLinesVisible(true);
        
        Button btn = new Button("Prihl·siù");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            	primaryStage.hide();
                
            	List<String> choices = new ArrayList<>();
            	choices.add("PoboËka");
            	choices.add("Sklad");

            	ChoiceDialog<String> dialog = new ChoiceDialog<>("PoboËka", choices);
            	dialog.setTitle("V˝ber pracoviska - Pakig");
            	dialog.setHeaderText("Prihl·senie ˙speönÈ!");
            	dialog.setContentText("Vyberte typ pracoviska:");
            	
            	Optional<String> result = dialog.showAndWait();
            	result.ifPresent(letter -> System.out.println("Vaöa voæba: " + letter));
                
                Stage stage = new Stage();
                stage.setTitle("NovÈ okno - Pakig");
                stage.setScene(new Scene(new GridPane(), 450, 450));
                stage.show();
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

}
