package hello;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloFX extends Application {
	

	public static void main(String[] args) {
		launch(args);

	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(new Scene(root, 400, 300));
		primaryStage.show();
	}

}
