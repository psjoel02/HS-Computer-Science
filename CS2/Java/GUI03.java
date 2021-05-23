import java.awt.*;
import javax.swing.*;

public class GUI03 extends JFrame
{
    private JLabel dont;
    private JLabel mess;
    private JLabel with;
    private JLabel texas;

    // constructor
    public GUI03()
    {

        dont = new JLabel("Don't");
        dont.setLocation(160, 20);
        dont.setSize(200, 60);
        dont.setForeground(Color.BLACK);
        dont.setFont(new Font("Arial", Font.PLAIN, 72));

        mess = new JLabel("Mess");
        mess.setLocation(160, 100);
        mess.setSize(200, 60);
        mess.setForeground(Color.BLACK);
        mess.setFont(new Font("Arial", Font.PLAIN, 72));

        with = new JLabel("With");
        with.setLocation(170, 180);
        with.setSize(200, 60);
        with.setForeground(Color.BLACK);
        with.setFont(new Font("Arial", Font.PLAIN, 72));

        texas = new JLabel("Texas");
        texas.setLocation(130, 260);
        texas.setSize(200, 60);
        texas.setForeground(Color.BLACK);
        texas.setFont(new Font("Arial", Font.PLAIN, 72));

        getContentPane().add(dont);
        getContentPane().add(mess);
        getContentPane().add(with);
        getContentPane().add(texas);

        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }

    // main method
    public static void main(String[] args)
    {
        GUI03 app = new GUI03();   // run program
    }
}