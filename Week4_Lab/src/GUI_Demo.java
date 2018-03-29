import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUI_Demo extends Application implements EventHandler<ActionEvent> {

	TextField txtFld;
	Button btn;
	Button btn2;

	@Override
	public void start(Stage primaryStage) throws Exception {

		txtFld = new TextField();
		txtFld.setPrefColumnCount(20);
		txtFld.setEditable(false);
		txtFld.setLayoutX(0);
		txtFld.setLayoutY(50);
		txtFld.setFont(new Font(25));

		Group grp = new Group(txtFld);

		btn = new Button();
		btn2 = new Button();

		btn2.setOnAction(this);
		btn2.setLayoutX(200);
		btn2.setLayoutY(100);
		btn2.setText("2!");

		//lambda expression * e -> * **only one function**
		btn.setOnAction(this);
		btn.setLayoutX(200);
		btn.setLayoutY(200);
		btn.setText("1!");

		grp.getChildren().addAll(btn, btn2);


		Scene sn = new Scene(grp,400,400);
		primaryStage.setScene(sn);
		primaryStage.show();

	}

	/*private void printMe(ActionEvent e) {

		txtFld.setText(txtFld.getText() + " Hello");
	}*/

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == btn) {
			txtFld.setText(txtFld.getText() + " 1");
		}
		else if(event.getSource() == btn2) {
			txtFld.setText(txtFld.getText() + " 2");
		}
	}

}
