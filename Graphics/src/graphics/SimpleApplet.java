import java.awt.*;
import java.applet.*;
import javax.swing.*;
/*
	<applet code="SimpleApplet" width="200" height="60"></applet>
*/
@SuppressWarnings("serial")
public class SimpleApplet extends JApplet 
{
	public void paint(Graphics grap)  //paint is overridden from the awt package
	{
		//grap.drawString("A Simple Applet", 60, 100);
		//grap.drawRect(20, 15, 230, 120);
		//grap.drawLine(100, 40, 100, 90);
		//a person
		
		grap.drawOval(40, 70, 80, 80);
		grap.drawOval(60, 90, 10, 10);
		grap.drawOval(80, 90, 10, 10);
		grap.drawLine(80, 150, 80, 200);
		grap.drawLine(80, 200, 40, 250);
		grap.drawLine(80, 200, 120, 250);
		
		//a triangle
		/*
		grap.drawLine(70, 20, 70, 110);
		grap.drawLine(70, 20, 180, 80);
		grap.drawLine(70, 110, 180, 80);
		*/
		//a rectangle
		/*
		grap.drawLine(70, 70, 190, 70);
		grap.drawLine(70, 70, 70, 120);
		grap.drawLine(190, 70, 190, 120);
		grap.drawLine(70, 120, 190, 120);
		*/
		//grap.drawRect(70, 70, 120, 50);
		
		//grap.drawString("Mukiibi Kelly Alvin", 120, 50);
		
		//grap.drawOval(50, 10, 170, 80);
		
		
	}
}