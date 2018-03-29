

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

	private String tmpValue;
	private String opSelect;

	@FXML
	private Button onebtn;

	@FXML
	private Button twobtn;

	@FXML
	private Button threebtn;

	@FXML
	private Button plusbtn;

	@FXML
	private Button equals;

	@FXML
	private TextField txtFld;

	@FXML
	private Button fourbtn;

	@FXML
	private Button fivebtn;

	@FXML
	private Button sixbtn;

	@FXML
	private Button sevenbtn;

	@FXML
	private Button eightbtn;

	@FXML
	private Button ninebtn;

	@FXML
	private Button subbtn;

	@FXML
	private Button multibtn;

	@FXML
	private Button dividebtn;

	@FXML
	private Button clr;
	
	@FXML
	private Button zerobtn;

	@FXML
	void calculate(ActionEvent event) {
		if(event.getSource() == onebtn) {
			txtFld.setText(txtFld.getText() + "1");
		}

		else if(event.getSource() == twobtn) {
			txtFld.setText(txtFld.getText() + "2");
		}

		else if(event.getSource() == threebtn) {
			txtFld.setText(txtFld.getText() + "3");
		}

		else if(event.getSource() == fourbtn) {
			txtFld.setText(txtFld.getText() + "4");
		}

		else if(event.getSource() == fivebtn) {
			txtFld.setText(txtFld.getText() + "5");
		}

		else if(event.getSource() == sixbtn) {
			txtFld.setText(txtFld.getText() + "6");

		}

		else if(event.getSource() == sevenbtn) {
			txtFld.setText(txtFld.getText() + "7");

		}

		else if(event.getSource() == eightbtn) {
			txtFld.setText(txtFld.getText() + "8");

		}

		else if(event.getSource() == ninebtn) {
			txtFld.setText(txtFld.getText() + "9");

		}
		
		else if(event.getSource() == zerobtn) {
			txtFld.setText(txtFld.getText() + "0");

		}

		else if(event.getSource() == plusbtn) {
			tmpValue = txtFld.getText();
			opSelect="ADD";
			txtFld.setText("");
		}

		else if(event.getSource() == subbtn) {
			tmpValue = txtFld.getText();
			opSelect = "SUBTRACT";
			txtFld.setText("");

		}

		else if(event.getSource() == multibtn) {
			tmpValue = txtFld.getText();
			opSelect = "MULTI";
			txtFld.setText("");
		}


		else if(event.getSource() == dividebtn) {
			tmpValue = txtFld.getText();
			opSelect = "DIVIDE";
			txtFld.setText("");
		}

		else if(event.getSource() == clr) {
			txtFld.setText("");
		}

		else if(event.getSource() == equals) {
			int preVal = Integer.parseInt(tmpValue);
			int newVal = Integer.parseInt(txtFld.getText());

			if(opSelect == "ADD") {
				txtFld.setText("" + (preVal+newVal));
			}

			else if(opSelect == "SUBTRACT") {
				txtFld.setText("" + (preVal-newVal));
			}

			else if(opSelect == "MULTI") {
				txtFld.setText("" + (preVal*newVal));
			}

			else if(opSelect == "DIVIDE") {
				if(newVal == 0) {
					txtFld.setText("DNE");
				}
				
				else
					txtFld.setText("" + (preVal/newVal));
				
			}
		}

	}

}
