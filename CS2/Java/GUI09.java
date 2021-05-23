import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

     // Step 1: make frame a listener
public class GUI09 extends JFrame implements ActionListener
{
	private JLabel label;
	private JButton onButton;
	private JButton offButton;

	public GUI09()
	{
		label = new JLabel("Computers Are Fun");
		label.setLocation(10, 200);
		label.setSize(450, 50);
		label.setFont(new Font("Arial", Font.BOLD, 48));

		onButton = new JButton("On");
		onButton.setLocation(120, 50);
		onButton.setSize(100, 50);

		offButton = new JButton("Off");
		offButton.setLocation(270, 50);
		offButton.setSize(100, 50);

        getContentPane().add(label);
        getContentPane().add(onButton);
        getContentPane().add(offButton);

		onButton.addActionListener(this);
        offButton.addActionListener(this);

		setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


	}

	 public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == onButton)             // identify source
        {
            label.setVisible(true);
        }

        if(event.getSource() == offButton)             // identify source
        {
            label.setVisible(false);
        }
    }






	 // main method
    public static void main(String[] args)
    {
        GUI09 app = new GUI09();  // run program
    }
}