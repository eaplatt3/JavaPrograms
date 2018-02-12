//Program to Find Average Speed in KM based on Given Values
public class AverageSpeed {
	public static void main(String [] args)
	{
		double baseMi = 1;
		double baseKm = 1.6;
		double Mi = 24;
		double time = 100.58;
		double converg = 0;
		double AvgSpd = 0;
		
		converg = baseKm * Mi;
		AvgSpd = (time / 60) / converg;
		
		System.out.println("The Average Speed is");
		System.out.println(AvgSpd);
		
	}

}
