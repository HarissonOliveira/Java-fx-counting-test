package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

	private int contador = 0;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label titleLabel = new Label("Contador");
		Label numberLabel = new Label("0");
		
		titleLabel.getStyleClass().add("title");
		numberLabel.getStyleClass().add("number");
		
		Button buttonIncrement = new Button("+");
		Button buttonDecrement = new Button("-");
		
		buttonDecrement.setOnAction(e -> {
			contador--;
			numberLabel.setText(Integer.toString(contador));
		});
		
		buttonIncrement.setOnAction(e -> {
			contador++;
			numberLabel.setText(Integer.toString(contador));
		});
		
		HBox buttonsBox = new HBox();
		buttonsBox.setSpacing(10);
		buttonsBox.setAlignment(Pos.CENTER);
		buttonsBox.getChildren().add(buttonDecrement);
		buttonsBox.getChildren().add(buttonIncrement);
		
		VBox contentBox = new VBox();
		contentBox.getStyleClass().add("content");
		contentBox.setSpacing(10);
		contentBox.setAlignment(Pos.CENTER);
		contentBox.getChildren().add(titleLabel);
		contentBox.getChildren().add(numberLabel);
		contentBox.getChildren().add(buttonsBox);
		
		String pathCss = getClass().getResource("/basico/Contador.css").toExternalForm();
		
		Scene mainScene = new Scene(contentBox, 400, 400);
		
		mainScene.getStylesheets().add(pathCss);
		mainScene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		primaryStage.setScene(mainScene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}