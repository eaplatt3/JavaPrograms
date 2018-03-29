

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainDriver extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent pnt = FXMLLoader.load(getClass().getResource("MyModel.fxml"));
		
		Scene sn = new Scene(pnt);
		primaryStage.setScene(sn);
		primaryStage.show();
		primaryStage.setTitle("Caculator");
		
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
	

}
