public class Student 
{

	private String name, email_address, gender;
	static int count;
	
	Student(String n, String e, String g)
	{
		name = n;
		email_address = e;
		gender = g;
		count++;
	}
	
	public void setEmail(String email)
	{
		email_address=email;
	}
	public String getEmail()
	{
		return email_address;
	}
	
	
	
}
