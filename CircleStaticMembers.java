public class CircleWithStaticMembers {
	
	double radius;
	
	static int numberOfObjects = 0;
	
	CircleWithStaticMembers(){
		radius = 1;
		numberOfObjects ++;
	}
	
	CircleWithStaticMembers(double newRadius){
		radius = newRadius;
		numberOfObjects ++;
	}
	
	static int getNumberOfObjects(){
		return numberOfObjects;
	}
	
	double getArea(){
		return radius * radius * Math.PI; 
	}

}


(x,y) Circle

 public class circleXY {
	
	public static void main(String[] args){
		

	}
	
Circlexy circle = new Circlexy();

//boolean inCircle(int x, int y );
	//return true
			
	System.out.println("x = " + x);
	System.out.println("y = " + y); 
	
class Circlexy{	

	protected int x, y;

  public Circlexy() {

      setPoint(0,0);

  }

  public Circlexy(int coordx, int coordy) {
      setPoint(coordx,coordy);
  }

  public void setPoint(int coordx, int coordy) {
      x = coordx;
      y = coordy;
  }
  public int getX() {
      return x;
  }

  public int getY() {
      return y;
  }

  }
}
