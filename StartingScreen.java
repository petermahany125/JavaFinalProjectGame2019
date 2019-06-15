import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Image;
import java.awt.event.*;
public class StartingScreen
{
    private static void createStartingScreen() throws IOException 
    {
        JFrame frame = new JFrame("Paint the Spaces");

        frame.setSize(700,700);
        frame.setResizable(false);
        frame.setVisible(true);

        Image image = ImageIO.read(new File("Background1.JPG"));
        Image newImage = image.getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        frame.setContentPane(new JLabel(new ImageIcon((image)))); 

        JButton button = new JButton("PLAY");
        JPanel p = new JPanel();
        p.setLayout(null);
        button.setBounds(200, 400, 75, 25);
        frame.add(button);
        frame.setLocationRelativeTo(null);
        frame.pack();

        frame.add(p);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException 
    {
        createStartingScreen();
    }
}
