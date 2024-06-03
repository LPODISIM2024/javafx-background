package hello;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPainExample extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		String javaVersion = System.getProperty("java.version");
		String javafxVersion = System.getProperty("javafx.version");
		Label jfxv = new Label("Hello, JavaFX " + javafxVersion);
		StackPane stackPane = new StackPane(jfxv);
		StackPane.setAlignment(jfxv, Pos.BOTTOM_CENTER);
		Scene scene = new Scene(stackPane, 640, 480); 
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}