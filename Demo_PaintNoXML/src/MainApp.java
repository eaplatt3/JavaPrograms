import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		MenuItem closeMenuItm = new MenuItem("Close");
		MenuItem saveMenuItm = new MenuItem("Save");
		MenuItem openMenuItm = new MenuItem("Open");
		Menu fileMenu = new Menu("File", null, closeMenuItm, saveMenuItm, openMenuItm);
		MenuBar mb = new MenuBar(fileMenu);
		
		Menu editMenu = new Menu("Edit", null);
		MenuBar mbe = new MenuBar(editMenu);
		
		VBox vb = new VBox(mb);
		
		
		Pane pn = new Pane(vb);
		Scene sn = new Scene(pn, 800, 600);
		
		stage.setScene(sn);
		stage.setTitle("My Paint App");
		stage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
