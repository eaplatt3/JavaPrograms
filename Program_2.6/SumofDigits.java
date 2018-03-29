//Scanner Import for Input
import java.util.Scanner;

public class SumofDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Variables
		int num;
		final int breakUpNum = 10;
		int onesDigits;
		int removeDigits;
		int tensDigits;
		int hunderdthDigits;
		int sum;
		
		//Receive user input 
		System.out.print("Enter a Number you Want to Add The Digits of Less then 1000: ");
		num = input.nextInt();
		
		//Arithmetic to Break up Digits
		onesDigits = num % breakUpNum;
		removeDigits = num / breakUpNum;
		tensDigits = removeDigits % breakUpNum;
		hunderdthDigits = removeDigits / breakUpNum;
	
		//Arithmetic to Sum All Numbers
		sum = onesDigits + tensDigits + hunderdthDigits;
		
		//Display Sum of Digits 
		System.out.print("The Sum of all The Digits in " + num + " Is " + sum);		
		
	}

}
