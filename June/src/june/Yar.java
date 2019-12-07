
public class Yar {

	public static void main(String[] args) throws AgeOutOfRangeException 
	{
		Yar x = new Yar();
		System.out.println(x.computeYOB(100));
	}
	public int computeYOB(int age) throws AgeOutOfRangeException
	{
		int current_year = 2013;
		int dob = 0;
		if(age<0 || age>120)
		{
			throw new AgeOutOfRangeException("Age out of range");
		}
		else
		{
			dob = current_year-age;
		}
		return dob;
	}

}
