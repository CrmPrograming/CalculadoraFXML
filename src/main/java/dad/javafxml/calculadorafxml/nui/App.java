package dad.javafxml.calculadorafxml.nui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(null, 320, 200);
		primaryStage.setTitle("Calculadora");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
