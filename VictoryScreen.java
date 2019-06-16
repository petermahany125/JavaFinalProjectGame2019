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
public class VictoryScreen
{
    private static void createVictoryScreen() throws IOException 
    {
        Frame frame = new Frame(700,700);

        Image image = ImageIO.read(new File("Background2.JPG"));
        Image newImage = image.getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        frame.setContentPane(new JLabel(new ImageIcon((image)))); 

        JPanel p = new JPanel();
        p.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.pack();

        frame.add(p);
    }

    public static void main(String[] args) throws IOException 
    {
        createVictoryScreen();
    }
}