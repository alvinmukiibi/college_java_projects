import java.awt.*;
import javax.swing.*;
public class JFieldTest extends JApplet
{
	JTextField ourJF;
	public void init()
	{
		Container contentpane = getContentPane();
		contentpane.setLayout(new FlowLayout());
		ourJF = new JTextField(15);
		contentpane.add(ourJF);
	}
	
}
