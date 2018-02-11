/* Earl Platt III      
 * BCS 345             
 * Lab 2 Assignment    
 * Random Phone NUmber*/

import javax.swing.JOptionPane; //import for display message 
import java.util.Random;        //import for random class


public class RandomPhoneNumber{

	public static void main(String[] args) {

		//Class to Generate a Pseudorandom Number 
		Random generator = new Random();
		
		//Variables
		int firstNum1, firstNum2, firstNum3;
		int secondNum;
		int thirdNum;

		//Assignment of Random Values to Variables
			//Generates Random Number from 1 to 7
		firstNum1 = generator.nextInt(7) + 1;
		firstNum2 = generator.nextInt(7) + 1;
		firstNum3 = generator.nextInt(7) + 1;
		
			//Generates Random Values from 100 to 655
		secondNum = generator.nextInt(555) + 100;
		
			//Generates Random Values from 1000 to 9999
		thirdNum = generator.nextInt(8999) + 1000;

		//Displays Window with Random Phone NUmber 
		JOptionPane.showMessageDialog(null, "The Random Phone Number is: " + firstNum1 + firstNum2 + firstNum3 + "-" + secondNum + "-" + thirdNum);

	}
}