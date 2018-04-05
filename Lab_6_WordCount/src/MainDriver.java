import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainDriver extends Application {
	
	TextArea txtFld;
			
	@Override
	public void start(Stage stage) throws Exception {
		
		
		//Function Test
		//String text = "i";

		//File Menu
		MenuItem saveMenuItm = new MenuItem("Save");
		MenuItem openMenuItm = new MenuItem("Open");
		MenuItem closeMenuItm = new MenuItem("Close");
		closeMenuItm.setOnAction(new EventHandler <ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				System.exit(0);
			}
		});
		
		txtFld = new TextArea();
		
		Menu fileMenu = new Menu("File", null, saveMenuItm, openMenuItm, closeMenuItm);
		MenuBar mb = new MenuBar(fileMenu);


		//Edit Menu
		MenuItem undoMenuItm = new MenuItem("Undo");
		MenuItem redoMenuItm = new MenuItem("redo");
		Menu editMenu = new Menu("Edit", null, undoMenuItm, redoMenuItm);
		MenuBar mb2 = new MenuBar(editMenu);

		//Review Menu
		MenuItem wordCountMenuItm = new MenuItem("Word Count");
		Menu reviewMenu = new Menu("Review", null, wordCountMenuItm);
		MenuBar mb3 = new MenuBar(reviewMenu);

		//Action When Word Count Fired, Opens Pop up
		wordCountMenuItm.setOnAction(new EventHandler <ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				Stage pu = new Stage();
				pu.setTitle("Word Count");
				TextArea msgFld = new TextArea();
				msgFld.setText(wordcount(txtFld.getText()) + "\n" + vowelcount(txtFld.getText()) + "\n"
						+ "Lines " + String.valueOf(linecount(txtFld.getText())));
				VBox popuVbox = new VBox(msgFld);
				popuVbox.getChildren().add(new Text("This is a Dialog"));
				Scene puScene = new Scene(popuVbox, 300, 200);
				pu.setScene(puScene);
				pu.show();
			}
		});


		txtFld.setPrefSize(1285, 650);
		txtFld.setWrapText(true);


		VBox vb = new VBox(mb);
		VBox vb2 = new VBox(mb2);
		vb2.setLayoutX(40);
		vb2.setLayoutY(0);
		VBox vb3 = new VBox(mb3);
		vb3.setLayoutX(80);
		vb3.setLayoutY(0);

		VBox txtVb = new VBox(txtFld);
		txtVb.setLayoutX(0);
		txtVb.setLayoutY(25);

		FlowPane pn = new FlowPane(vb, vb2, vb3, txtVb);
		pn.setMaxSize(1200, 650);
		Scene sn = new Scene(pn,1290,650);

		stage.setScene(sn);
		stage.setTitle("Note Pad");
		stage.show();

	}


	public static void main(String[] args) {
		launch(args);

	}

	//Function to count words and Spaces
	public  String wordcount(String text) { 
		if (text == null || text.isEmpty()) { 
			return "No Stats"; 
		} 
		int count=0;
		Scanner sn=new Scanner(text);
		while(sn.hasNext()) {
			sn.next();
			count++;
		}

//		int wordCtn = 0;
//		int spaceCtn = 0;
//		boolean isWord = false; 
//		int endOfLine = text.length() - 1; 
//		char[] characters = text.toCharArray(); 
//		for (int i = 0; i < characters.length; i++) { 
//
//			// if the char is a letter, word = true. 
//			if (Character.isLetter(characters[i]) && i != endOfLine) { 
//				isWord = true;
//			}
//
//			// if char isn't a letter and there have been letters before, 
//			// counter goes up.  
//
//			else if (!Character.isLetter(characters[i]) && isWord) {
//				wordCtn++; 
//				isWord = false;
//				spaceCtn++;
//
//				// last word of String; if it doesn't end with a non letter, it 
//				// wouldn't count without this. 
//			}
//
//
//			else if (Character.isLetter(characters[i]) && i == endOfLine) { 
//				wordCtn++;
//			}
//
//		} 

		return "Words " +count;//+ "\nSpaces " + spaceCtn;
	}

	//Function to count vowels
	public  String vowelcount(String text) {	
		int vowelCtn = 0;
		char[] characters = text.toCharArray(); 
		for (int i = 0; i < characters.length; i++) { 

			if(text.charAt(i) == 'a' || text.charAt(i) == 'A' || text.charAt(i) == 'e' || text.charAt(i) == 'E'
					|| text.charAt(i) == 'i' || text.charAt(i) == 'I' || text.charAt(i) == 'o' || text.charAt(i) == 'O'
					|| text.charAt(i) == 'u' || text.charAt(i) == 'U') {
				vowelCtn++;
			}
		}

		return "Vowels " + vowelCtn;
	}

	//Function to count Lines
	public  int linecount(String text) {
		return  text.split("[\r\n]").length;
	}
}
