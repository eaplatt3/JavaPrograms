import java.util.Scanner; //import to use scanner 

public class SumTwoNum {

	public static void main(String[] args) {
		
		//Creating User input
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Enter Number ");
		
		//getting user input
		int n = in.nextInt();
		
		System.out.println("Enter Number ");
		
		//Getting user input		
		int m = in.nextInt();
		
		//Adding 2 inputed number 
		int sum = n + m;
		//displaying input
		System.out.println("the sum is: " + sum);
		System.out.println("The 2 numbers");

	}

}
