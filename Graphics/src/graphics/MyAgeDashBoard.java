import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyAgeDashBoard implements ActionListener {

	private JButton myButton;
	private JFrame ourFrame;
	private Container myCont;
	private JTextField input;
	private JLabel myLabel, resultantLabel;
	public MyAgeDashBoard()
	{
		ourFrame = new JFrame("AGE PHRASE EQUIVALENT");
		ourFrame.setSize(500,400);
		ourFrame.setLocationRelativeTo(null);
		ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ourFrame.setVisible(true);
		
		input = new JTextField();
		myLabel = new JLabel("Age");
		myButton = new JButton("Get Phrase");
		
		myCont = ourFrame.getContentPane();
		myCont.setLayout(new GridLayout(2,2));
		
		ourFrame.add(myLabel);
		ourFrame.add(input);
		ourFrame.add(myButton);
		ourFrame.add(resultantLabel);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		MyAgeDashBoard invoke = new MyAgeDashBoard();

	}
	public String sayAge(int age)
	{
		if(age > 10 && age < 20)
			return "You are an adoloscent";
		else if(age > 20)
			return "You are an adult now";
		else
			return "You are still very young";
			
				
			
	}
	
	
	public void actionPerformed(ActionEvent event)
	{
		String putAge = input.getText();
		int age = Integer.parseInt(putAge);
		String phrase = sayAge(age);
		resultantLabel.setText(phrase);		
	}
	

}
