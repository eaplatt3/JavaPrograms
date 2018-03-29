import java.util.Scanner;

public class CylinderVolume {
	
	public static void main(String [] args) {
		//Create Scanner(User Input)
		Scanner input = new Scanner(System.in);
		
		double area;
		double volume;
		double PI = 3.14;
		
		System.out.print("Enter The Radius of the Cylinder: ");
		double radius = input.nextDouble();
		
		System.out.print("Enter The Length of the Cylinder: ");
		double length = input.nextDouble();
		
		area = radius * radius * PI;
		volume = area * length;
		
		System.out.println("The Area of the Cylinder is: " + area + " " + "Volume of the Cylinder is: " + volume);		
		
	}

}
