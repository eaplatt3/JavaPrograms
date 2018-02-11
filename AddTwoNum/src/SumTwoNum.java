import java.util.Scanner; //import to use scanner 

public class SumTwoNum {

	public static void main(String[] args) {
		
		//Creating User input
		Scanner in = new Scanner(System.in); 
		
		System.out.print("Enter Number: ");
		//getting user input
		int n = in.nextInt();
		
		System.out.print("Enter Number: ");
		//Getting user input		
		int m = in.nextInt();
		
		//Adding 2 inputed numbers
		int sum = n + m;
		
		//displaying input
		System.out.println();
		System.out.print("The Sum of the Numbers " + n + " & " + m);
		System.out.println(" is: " + sum);

	}

}