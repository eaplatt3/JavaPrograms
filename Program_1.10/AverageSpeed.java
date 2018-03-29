//Program to Display Average Speed In Miles Based on Given Values
public class AverageSpeed {
	public static void main(String [] args)
	{
		double baseKm = 1.6;
		double baseMi = 1;
		double Km = 14;
		double time = 45.5;
		double converg = 0;
		double Mi = 0;
		double AvgSpd = 0;
		
		//Coverting To Miles and Arithmatic 
		converg = Km / baseKm;
		Mi = converg * baseMi;
		AvgSpd = time / Mi;
		
		System.out.println("The Runners Average Speed is");
		System.out.println(AvgSpd);
				
	}

}
