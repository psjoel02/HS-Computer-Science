import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI04 extends JFrame
{
    // Step 1 : declare JLabel variable
    private JLabel label;

    // constructor
    public GUI04()
    {
        // Step 2: create ImageIcon object using an image file as a parameter
        ImageIcon image = new ImageIcon("bugsdaffy.jpg");

        // Step 3: create label using ImageIcon variable as parameter
        label = new JLabel(image);

        // Step 4: set label attributes
        label.setLocation(0,0);
        label.setSize(image.getIconWidth(), image.getIconHeight());

        // Step 5: add label to frame
        getContentPane().add(label);


        // set frame attributes
        setLayout(null);
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // main method
    public static void main(String[] args)
    {
        GUI04 app = new GUI04();
    }
}
