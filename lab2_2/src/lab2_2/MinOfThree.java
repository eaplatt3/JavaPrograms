package lab2_2;

//********************************************************************
//
//
//Demonstrates	the	use	of	nested	if	statements.
//********************************************************************
import	java.util.Scanner;
public	class	MinOfThree
{
	//-----------------------------------------------------------------
	//		Reads	three	integers	from	the	user	and	determines	the	smallest
	//		value.
	//-----------------------------------------------------------------
	public	static	void	main(String[]	args)
	{
				int	numOFEntries, num,	min = Integer.MAX_VALUE;
				Scanner	scan	=	new	Scanner(System.in);
				System.out.println("Enter number of	integers:	");
				numOFEntries = scan.nextInt();
				//num1	=	scan.nextInt();
				//num2	=	scan.nextInt();
				//num3	=	scan.nextInt();
				
				for(int i = 0; i<numOFEntries; i++) {
					System.out.println("Enter number of	integers:	");
					num = scan.nextInt();
					
					if	(min >	num)
						min = num;
				}
				
				System.out.println("Minimum	value:	"	+ min);			
	}
}
