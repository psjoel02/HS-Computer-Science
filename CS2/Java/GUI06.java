import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI06 extends JFrame
{
    // constructor
    public GUI06()
    {
        // set frame attributes
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setVisible(true);
    }

    public void paint(Graphics page)
    {
        super.paint(page);  // erase background
        for(int i = 0; i < 500; i++){

	int r = (int)(Math.random() * 256);  // random red
	int g = (int)(Math.random() * 256);  // random green
	int b = (int)(Math.random() * 256);  // random blue

	Color myColor = new Color(r, g, b);   // create color
	page.setColor(myColor);               // set graphics object to new color
	int x1 = (int)(Math.random() * 500);
	int y1 = (int)(Math.random() * 500);
	int x2 = (int)(Math.random() * 500);
	int y2 = (int)(Math.random() * 500);

	page.drawLine(x1, y1, x2, y2);  // draw line from point (x1, y1) to (x2, y2)
        }
    }

    // main method
    public static void main(String[] args)
    {
        GUI06 app = new GUI06();  // run program
    }
}