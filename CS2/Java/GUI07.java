import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI07 extends JFrame
{
    // Step 1 : create JButton variable
    private JButton button1;
    private JButton button2;

    public GUI07()
    {
        // Step 2 : create a JButton object and store its reference in the JButton variable
        button1 = new JButton("OK");
        button2 = new JButton("Cancel");
        // Step 3 : set the attributes for the button (location, size, color, etc.)
        button1.setLocation(100,400);
        button1.setSize(80,30);
        button2.setLocation(300,400);
        button2.setSize(80,30);

        // Step 4: add the JButton to the content pane of the frame
        getContentPane().add(button1);
        getContentPane().add(button2);


        // set frame attributes
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }

    // main method
    public static void main(String[] args)
    {
        GUI07 app = new GUI07();  // run program
    }
}