import java.awt.*;
import javax.swing.*;
public class FieldDemo extends JApplet
{
	public void init()
	{
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		JTextField fiel = new JTextField(12);
		JLabel lab = new JLabel("Name");
		JButton kol = new JButton("Submit");
		cont.add(lab);
		cont.add(fiel);
		cont.add(kol);
	}
}
