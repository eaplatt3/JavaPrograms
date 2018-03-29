import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
	
	String leftParent;

    @FXML
    private Button radBtn;

    @FXML
    private Button degBtn;

    @FXML
    private Button percentBtn;

    @FXML
    private Button rightParentBtn;

    @FXML
    private Button leftParentBtn;

    @FXML
    private Button factorialBtn;

    @FXML
    private Button CeBtn;

    @FXML
    private Button invBtn;

    @FXML
    private Button sinBtn;

    @FXML
    private Button lnBtn;

    @FXML
    private Button sevenBtn;

    @FXML
    private Button eightBtn;

    @FXML
    private Button nineBtn;

    @FXML
    private Button divideBtn;

    @FXML
    private Button piBtn;

    @FXML
    private Button cosBtn;

    @FXML
    private Button logBtn;

    @FXML
    private Button fourBtn;

    @FXML
    private Button fiveBtn;

    @FXML
    private Button sixBtn;

    @FXML
    private Button multiplyBtn;

    @FXML
    private Button eBtn;

    @FXML
    private Button tanBtn;

    @FXML
    private Button sqrRootBtn;

    @FXML
    private Button oneBtn;

    @FXML
    private Button twoBtn;

    @FXML
    private Button threeBtn;

    @FXML
    private Button subBtn;

    @FXML
    private Button ansBtn;

    @FXML
    private Button expBtn;

    @FXML
    private Button exponentBtn;

    @FXML
    private Button zeroBtn;

    @FXML
    private Button decimalBtn;

    @FXML
    private Button equalBtn;

    @FXML
    private Button plusBtn;

    @FXML
    private TextField txtField;

    @FXML
    void calculate(ActionEvent event) {
    	if(event.getSource() == oneBtn) {
    		txtField.setText(txtField.getText() + "1");
    			}
    	
    	if(event.getSource() == percentBtn) {
    		txtField.setText(txtField.getText() + "%");
    			}
    	
    	if(event.getSource() == leftParentBtn) {
    		txtField.setText(txtField.getText() + "(");
    		leftParent = "true";
    			}
    	
    	if(event.getSource() == rightParentBtn) {
    		if(leftParent == "true") {
    		txtField.setText(txtField.getText() + ")");
    		}
    		
    			}
    	
    	if(event.getSource() == factorialBtn) {
    		txtField.setText(txtField.getText() + "!");
    			}
    	
    	if(event.getSource() == CeBtn) {
    		txtField.setText(txtField.getText().substring(0, txtField.getText().length()-1));
    			}
    	
    	if(event.getSource() == sinBtn) {
    		txtField.setText(txtField.getText() + "sin(");
    			}
    	

    }

}
