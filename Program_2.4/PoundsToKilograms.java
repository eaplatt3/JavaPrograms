//Import For Input 
import java.util.Scanner;

public class PoundsToKilograms {
	public static void main(String[] args) {
		//Create the Scanner for input
		Scanner input = new Scanner(System.in);
		
		//Variables
		double lbs;
		double kg;
		double baseKg = 0.454;
		
		//Receive user Input
		System.out.print("Enter the Number of Pounds to Convert to Kilograms: ");
		lbs = input.nextDouble();
		
		//The Arithmetic for the conversion 
		kg = lbs * baseKg;
		
		//Display The conversion 
		System.out.print(lbs + " lbs Is " + kg + " In Kg");
				
	}

}
