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
		
		VBox mainBox = new VBox();
		mainBox.setSpacing(10);
		mainBox.setAlignment(Pos.CENTER);
		mainBox.getChildren().add(titleLabel);
		mainBox.getChildren().add(numberLabel);
		mainBox.getChildren().add(buttonsBox);
		
		Scene mainScene = new Scene(mainBox, 400, 400);
		
		primaryStage.setScene(mainScene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}