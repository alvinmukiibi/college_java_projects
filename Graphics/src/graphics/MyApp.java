import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyApp {

	Button aButton = new Button();
	class MyActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			System.out.println("Hello There");
		}
	}
	MyApp() 
	{
		MyActionListener al = new MyActionListener();
		aButton.addActionListener(al);
	}
}
