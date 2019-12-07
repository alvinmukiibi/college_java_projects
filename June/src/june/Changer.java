
public class Changer 
{
	
	public static void main(String args[])
	{
		NewBicycle bike = new NewBicycle("changer",45.6,78.0,6,9.5);
		double distance = bike.mileage;
		int time = bike.duration;
		
		double avgspeed = distance / time;
		System.out.println("The avg speed is " + avgspeed + " m/s");	
	}
}
