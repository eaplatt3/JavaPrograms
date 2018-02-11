package lab2_3;

//********************************************************************
//PalindromeTester.java							Author:	Lewis/Loftus
//
//Demonstrates	the	use	of	nested	while	loops.
//********************************************************************
import	java.util.Scanner;
public	class	PalindromeTester
{
	//-----------------------------------------------------------------
	//		Tests	strings	to	see	if	they	are	palindromes.
	//-----------------------------------------------------------------
	public	static	void	main(String[]	args)
	{
				String str,	another	=	"y";
				int	left,	right, num2, num4, prod;
				Scanner	scan	=	new	Scanner(System.in);
				while	(another.equalsIgnoreCase("y"))		//	allows	y	or	Y
				{
							System.out.println("Enter	a	potential	palindrome:");
							for(int n = 1000; n <=9999; n++) {
								for(int m = 10; m<=99; m++) {
									prod = n*m;
								}
							}
							
							if (prod % 2 == 0) {

							left	=	0;
							right	=	str.length()	- 1;
							while	(str.charAt(left)	==	str.charAt(right)	&&	left	<	right)
							{
										left++;
										right--;
							}
							
							
							
							System.out.println();
							if	(left	<	right)
										System.out.println("That	string	IS	a	palindrome.");
							}
							
							else
								System.out.println("That	string	is	NOT	Even");
							
							System.out.println();
							System.out.print("Test	another	palindrome	(y/n)?	");
							another	=	scan.nextLine();
				}
	}
}
