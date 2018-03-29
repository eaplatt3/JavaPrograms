import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainDriver extends Application {

	@Override
	public void start(Stage Stage) throws Exception {
		
		Parent prnt = FXMLLoader.load(getClass().getResource("ModelForTheGUI.fxml"));
		Scene sn = new Scene(prnt);
		Stage.setScene(sn);
		Stage.show();
	
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
