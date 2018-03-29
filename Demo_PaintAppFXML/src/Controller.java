import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Controller {
	
	String selectShape;
	double x1,x2, y1, y2;
	
    @FXML
    private MenuItem closeMenuItm;

    @FXML
    private ToggleButton lineBtn;

    @FXML
    private ToggleButton rectBtn;
    
    @FXML
    private ToggleButton eraseBtn;

    @FXML
    private ToggleGroup ToolBar;

    @FXML
    private ToggleButton ovalBtn;

    @FXML
    private Canvas myCanvas;
    @FXML
    private Slider mySlide;

    @FXML
    private ColorPicker myColorPicker;

    
    @FXML
    void selectShape(ActionEvent event) {
    	
    	if(event.getSource() == lineBtn) {
    		selectShape = "LINE";
    	}
    	else if(event.getSource() == rectBtn) {
    		selectShape = "RECT";

    	}
    	else if(event.getSource() == ovalBtn) {
    		selectShape = "OVAL";
    	}
    	else if(event.getSource() == eraseBtn) {
    		selectShape = "ERASE";
    	}
    }
    
    @FXML
    void closeApp(ActionEvent event) {
    		System.exit(0);
    }
    
    @FXML
    void drawShap(MouseEvent event) {
    		x2=event.getX();
    		y2=event.getY();
    		GraphicsContext gc=myCanvas.getGraphicsContext2D();
    		gc.setLineWidth(mySlide.getValue());
    		gc.setStroke(myColorPicker.getValue());
    		
    		if(selectShape.equals("LINE")) {
    		gc.strokeLine(x1, y1, x2, y2);
    		}
    		else if(selectShape.equals("RECT")) {
        		gc.strokeRect(Math.min(x1,x2),Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1)); 
        		}
    		else if(selectShape.equals("OVAL")) {
        		gc.strokeOval(Math.min(x1,x2), y1, x2, y2);
        		}
    		else if(selectShape.equals("ERASE")) {
    			gc.setStroke(Color.WHITE);
        		gc.fillRect(x1, y2, mySlide.getValue(), mySlide.getValue()); 
        		}
    }

    @FXML
    void startDrawing(MouseEvent event) {
		x1=event.getX();
		y1=event.getY();
    }

}
