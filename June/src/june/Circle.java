
public class Circle implements Shape
{
	private double radius;
	public double area()
	{
		return (PI * radius * radius);
	}
	public double circumference()
	{
		return (2 * PI * radius);
	}
	public static void main(String args[])
	{
		Circle x = new Circle();
		x.radius=7;
		System.out.println("area = " + x.area() + " and the circumference = " + x.circumference());
	}
}
