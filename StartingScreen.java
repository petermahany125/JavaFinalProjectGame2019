//Rahul Iyengar
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Image;
import java.awt.event.*;
public class StartingScreen
{       
    public static void createStartingScreen() throws IOException
    {
        //This code creates the JFrame for the starting screen
        JFrame frame = new JFrame("Paint the Spaces");
        frame.setSize(700,700);

        //This code sets the ContentPane of the frame to the image to display the background
        Image image = ImageIO.read(new File("Background1.PNG"));
        Image newImage = image.getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        frame.setContentPane(new JLabel(new ImageIcon((newImage))));
        
        //This code creates the JButton to play the game and adds it to the JFrame in the correct location
        JButton button = new JButton("PLAY");
        button.setBounds(290, 450, 150, 50);
        button.setFont(new Font("Serif", Font.BOLD, 40));
        frame.add(button);
        frame.setLocationRelativeTo(null);
        frame.pack();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) throws IOException
    {
        createStartingScreen();
    }
}
