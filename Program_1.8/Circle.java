//Program to display the Area and Perimeter of a circle 
//With a given Value of 5.5
public class Circle {
		public static void main(String [] args) 
		{
			double per = 0;
			double area = 0;
			double radius = 5.5;
			double pI = 3.14;
			
			per = 2 * radius * pI;
			area = radius * radius * pI;
			
			System.out.println("The Perimeter of the Circle is: ");
			System.out.println(per);
			
			System.out.println("The Area of the Circle is: ");
			System.out.println(area);
			
		}

}
