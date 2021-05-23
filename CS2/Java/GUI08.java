import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

     // Step 1: make frame a listener
public class GUI08 extends JFrame implements ActionListener
{
    // instance variables
    private JButton button1;
    private JButton button2;
    // constructor
    public GUI08()
    {
        // create button
        button1 = new JButton("Change Color");
        button2 = new JButton("Draw Circle");

        // set button attributes
        button1.setLocation(175,50);
        button1.setSize(150, 50);
       	button2.setLocation(175,130);
        button2.setSize(150, 50);

        // add button to frame
        getContentPane().add(button1);
        getContentPane().add(button2);

        // Step 2: register listener with button
        button1.addActionListener(this);
        button2.addActionListener(this);

        // set frame attributes
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Step 3: add an actionPerformed method
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == button1)             // identify source
        {
            int r = (int)(Math.random() * 256);     // red intensity: 0..255
            int g = (int)(Math.random() * 256);     // green intensity: 0..255
            int b = (int)(Math.random() * 256);     // blue intensity:0..255
            Color color = new Color(r, g, b);       // make custom color
            getContentPane().setBackground(color);  // change background of frame
        }
       if(event.getSource() == button2)
       {
        Graphics page = getGraphics();
        int r = (int)(Math.random() * 256);  // random red
		int g = (int)(Math.random() * 256);  // random green
		int b = (int)(Math.random() * 256);  // random blue
		Color myColor = new Color(r, g, b);   // create color
		page.setColor(myColor);               // set graphics object to new color
		int x = (int)(Math.random() * 500);
		int y = (int)(Math.random() * 500);

		page.fillOval(x, y, 100, 100);
       }
    }

    // main method
    public static void main(String[] args)
    {
        GUI08 app = new GUI08();  // run program
    }
}