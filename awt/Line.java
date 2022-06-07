import java.awt.*;
import java.applet.*;
public class Line extends Applet
{
 public void paint(Graphics g)
{
 g.drawLine(100,10,50,50);
 g.drawRect(300,50,70,50);
 g.drawOval(200,20,70,70);
g.setColor(Color.yellow);
g.fillOval(80, 70, 150, 150);
 
  g.setColor(Color.black);    
 g.fillOval(120, 120, 15, 15);
 g.fillOval(170, 120, 15, 15);
 
   g.drawArc(115, 140, 80, 50, 180, 190);
    }


}