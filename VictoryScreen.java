//Rahul Iyengar
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Image;
import java.awt.event.*;
public class VictoryScreen
{
    public static void createVictoryScreen()
    {
        //This block of code creates the JFrame and JPanel and sets their sizes and creates the JLabel for the background
        JFrame frame = new JFrame("Paint the Spaces");
        frame.setSize(700,700);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(700,700);
        JLabel background;
        try{
            //This code sets the background label to the image, scales it to the size of the JPanel, and then adds it to the JPanel
            Image image = ImageIO.read(new File("Background2.PNG"));
            Image newImage = image.getScaledInstance(700, 700, Image.SCALE_DEFAULT);
            background = new JLabel(new ImageIcon(newImage));
            background.setBounds(0,0,700, 700);
            panel.add(background);
        }
        catch (Exception e) 
        {
            System.out.println("File not found");
        }
        //This block creates the JLabel that displays your time at the end of the game
        JLabel textLabel = new JLabel("Time");
        textLabel.setFont(new Font("TimesRoman", Font.BOLD, 30)); 
        textLabel.setBounds(200, 400, 100, 100);

        //This creates the JLayeredPane and adds the JPanel and the JLabel that displays the time
        JLayeredPane pane = frame.getLayeredPane(); 
        pane.add(panel, new Integer(1));
        pane.add(textLabel, new Integer(2));
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public static void main (String[] args)
    {
        createVictoryScreen();
    }
}

