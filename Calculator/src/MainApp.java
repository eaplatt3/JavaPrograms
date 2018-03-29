import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		Parent pnt = FXMLLoader.load(getClass().getResource("Mmodel.fxml"));
		
		Scene sn = new Scene(pnt);
		stage.setScene(sn);
		stage.show();
		stage.setTitle("Calculator");
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
