import java.util.Date;
 
 
public class GeometricObject {
   	
   	protected String color = "Black";
   	protected boolean filled;
   	protected Date dateCreated;
   	
   	public GeometricObject(){
         	this.dateCreated = new Date();
   	}
   	
   	public GeometricObject(String color, boolean filled){
         	this();
         	this.color = color;
         	this.filled = filled;
   	}
 
   	public String getColor() {
         	return this.color;
   	}
 
   	public boolean isFilled() {
         	return this.filled;
   	}
 
   	public Date getDateCreated() {
         	return this.dateCreated;
   	}
 
   	protected void setColor(String color) {
         	this.color = color;
   	}
 
   	protected void setFilled(boolean filled) {
         	this.filled = filled;
   	}
   	
   	public String toString(){
         	return "GeometricObject[ Date Created: "+this.dateCreated+", color: "
                             	+this.color+", filled "+this.filled+"]";
   	}
   	
 
}
 
import java.util.Scanner;
 
 
public class Triangle extends GeometricObject {
   	
   	Scanner input = new Scanner(System.in);
   	
   	private double side1 = 1.0;
   	private double side2 = 1.0;
   	private double side3 = 1.0;
   	private double s = side1+side2+side3;
   	
   	public Triangle(double side1, double side2, double side3){
         	this.side1 = side1;
         	this.side2 = side2;
         	this.side3 = side3;
   	}
   	
   	public Triangle(String color, boolean filled, double side1, double side2, double side3){
         	super();
         	this.color = color;
         	this.setFilled(filled);
         	this.side1 = side1;
         	this.side2 = side2;
         	this.side3 = side3;
   	}
   	
   	public double getPerimeter(){
         	return side1 + side2 + side3;
   	}
   	
   	
   	public double getArea(){
         	return Math.pow((s)*(s-side1)*(s-side2)*(s-side3), 0.5);
   	}
   	
   	public String toString(){
         	return "Triangle: Side1 = "+side1+" side2 = "+side2+" side3 = "+side3;
   	}
}
 
import java.io.PrintStream;
import java.util.Scanner;
 
 
public class MyTest {
   	
   	/**
   	 *
   	 * @param args
   	 */
   	
   	public static void main(String[] args){
         	
         	Scanner input = new Scanner(System.in);
         	
         	PrintStream ps = System.out;
         	
         	ps.print("Enter 3 Sides of A Triangle ");
                	double side1 = input.nextDouble();
                	double side2 = input.nextDouble();
                	double side3 = input.nextDouble();
         	
         	ps.print("Enter The Color Of The Triangle ");
                	boolean color = (boolean) input.nextBoolean();
                	
         	ps.print("Enter If Triangle is Filled ");
                	String fill = (String) input.next();
         	
         	
                	
         	GeometricObject go = new GeometricObject();
         	
         	Triangle tri = new Triangle(fill,color,side1,side2,side3);
         	
                       	//ps.println(go);
         	ps.println(tri);
         	ps.println("the Perimeter is: " + tri.getPerimeter());
         	ps.println("The Area is: " + tri.getArea());
   	}
   	
}
 