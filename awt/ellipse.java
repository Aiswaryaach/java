import java.awt.*;
import javax.swing.*;

public class ellipse extends JApplet {

	public void init()
	{
		// set size
		setSize(400, 400);

		repaint();
	}

	// paint the applet
	public void paint(Graphics g)
	{
		// set Color for rectangle
		g.setColor(Color.red);

		g.drawOval(100, 100, 150, 100);
	}
}
