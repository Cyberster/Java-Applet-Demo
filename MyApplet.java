import java.awt.*;
import java.applet.*;

public class MyApplet extends Applet {
	public void init () {
		setBackground(Color.PINK);
		setForeground(Color.BLUE);
	}
	
	public void start () {
		
	}
	
	public void stop () {
		
	}
	
	public void destroy () {
		
	}
	
	public void paint (Graphics g) {
		Font f = new Font("Tahoma", Font.BOLD+Font.ITALIC, 20); // use bitwise | or + to specify two styles
		
		g.drawString("Hello Applet", 100, 50);
		g.setColor(Color.RED);
		g.drawString(getParameter("var1"), 100, 70); // receiving parameter from html param tag
		g.setFont(f);
		g.drawString(getParameter("var2"), 100, 90);
	}
}