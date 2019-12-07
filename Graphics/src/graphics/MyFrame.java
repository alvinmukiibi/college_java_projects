import java.awt.*;
import javax.swing.*;
/*
 		JFrame myFrame = new JFrame("My First Frame"); //creates a frame wiht title as specified
		myFrame.setSize(300,300);
		//myFrame.setLocation(900,34); //sets location of upper left corner of window from the corner of the window, by x and y
		myFrame.setLocationRelativeTo(null); //centers the window on the screen
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //what to do if the frame is closed
		myFrame.setVisible(true);  //sets the frame to display
 */

public class MyFrame extends JFrame
{
	public static void main(String args[])
	{
		MyFrame myFrame = new MyFrame();
		myFrame.setTitle("ENTER THE DETAILS");
		myFrame.setSize(300,300);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  		
		myFrame.setVisible(true);  
	}
	public MyFrame()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		add(new JLabel("First Name"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("Last Name"));
		add(new JTextField(8));
	}
}
