package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		Text statement = new Text(20, 20, "Why?");
		Text hello = new Text(50, 50, "Hello, JavaFX!");
		Text question = new Text(120, 80, "How's it going?");

		Group root = new Group(statement, hello, question);
		Scene scene = new Scene(root, 600, 240, Color.RED);

		primaryStage.setTitle("Questions");
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}



	public static void main(String[] args) {
		launch(args);
	}
}
