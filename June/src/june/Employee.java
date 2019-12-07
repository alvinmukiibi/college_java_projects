
public class Employee 
{
	private double salary;
	private String department;
	
	Employee(double salary, String department)
	{
		this.salary = salary;
		this.department = department;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getDepartment()
	{
		return department;
	}
}
