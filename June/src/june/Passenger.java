
public class Passenger 
{
	private String numberPlate;
	private int numPassengers;
	public void setNumberPlate(String numPlate)
	{
		numberPlate = numPlate;
	}
	public String getNumberPlate()
	{
		return numberPlate;
	}
	public void setNumPassengers(int numP)
	{
		if(numP > 14)
		{
			System.out.println("Taxi is already full");
		}
		else
		{
			numPassengers = numP;
		}
	}
	public int getNumPassengers()
	{
		return numPassengers;
	}
	
}
