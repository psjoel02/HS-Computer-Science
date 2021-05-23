import javax.swing.*;

public class GUI05 extends JFrame
{
    // Step 1 : declare JLabel variable
    private JLabel jack;
    private JLabel queen;
    private JLabel king;

    // constructor
    public GUI05()
    {
        // Step 2: create ImageIcon object using an image file as a parameter
        ImageIcon jacki = new ImageIcon("jack.gif");
        ImageIcon queeni = new ImageIcon("queen.gif");
        ImageIcon kingi = new ImageIcon("king.gif");

        // Step 3: create label using ImageIcon variable as parameter
        jack = new JLabel(jacki);
        queen = new JLabel(queeni);
        king = new JLabel(kingi);

        // Step 4: set label attributes
        jack.setLocation(80,0);
        jack.setSize(jacki.getIconWidth(), jacki.getIconHeight());
        queen.setLocation(180,0);
        queen.setSize(jacki.getIconWidth(), jacki.getIconHeight());
        king.setLocation(280,0);
        king.setSize(jacki.getIconWidth(), jacki.getIconHeight());

        // Step 5: add label to frame
        getContentPane().add(jack);
        getContentPane().add(queen);
        getContentPane().add(king);


        // set frame attributes
        setLayout(null);
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // main method
    public static void main(String[] args)
    {
        GUI05 app = new GUI05();
    }
}