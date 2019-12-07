public class NewBicycle extends Bicycle
{
	double seatHeight = 7;
	NewBicycle(String t, double w, double m, int d, double s)
	{
		super(t,w,m,d);
		seatHeight = s;
	}
}
