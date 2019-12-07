import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TemperatureDashBoard implements ActionListener
{
	private Container pane;
	private JTextField textfield;
	private JButton classifyButton;
	private JLabel tempLabel, classificationLabel;
	private JFrame frame;
	
	public TemperatureDashBoard()
	{
		frame = new JFrame("Temperature Classification Dashboard by Mukiibi"); //window header
		frame.setSize(500,200);  //width by height
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pane = frame.getContentPane();
		pane.setLayout(new GridLayout(2,2));
		
		tempLabel = new JLabel("Temperature: ");
		classifyButton = new JButton("Classify");
		textfield = new JTextField(5);
		classificationLabel = new JLabel("Thank you");
		
		pane.add(tempLabel);
		pane.add(textfield);
		pane.add(classifyButton);
		pane.add(classificationLabel);
		
		classifyButton.addActionListener(this);
		frame.setVisible(true);
	}
	public String classifyTemp(int currentTemp)
	{
		if (currentTemp > 30)
			return " It is too hot";
		else if (currentTemp > 18)
			return " It is warm";
		else
			return " It is too cold";
	}
	public void actionPerformed (ActionEvent event)
	{
		String text = textfield.getText();
		int temp = Integer.parseInt (text);
		String classification = classifyTemp(temp);
		classificationLabel.setText (classification);
	}
	public static void main(String args[])
	{
		TemperatureDashBoard tempDashboard = new TemperatureDashBoard();
	}
}