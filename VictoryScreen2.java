//Rahul Iyengar
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Image;
import java.awt.event.*; 
public class VictoryScreen2 
{
    private String userInput; 
    private static JTextField text = new JTextField(100);
    public static void createVictoryScreen2() 
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
            Image image = ImageIO.read(new File("Background3.PNG"));
            Image newImage = image.getScaledInstance(700, 700, Image.SCALE_DEFAULT);
            background = new JLabel(new ImageIcon(newImage));
            background.setBounds(0,0,700, 700);
            panel.add(background);
        }
        catch (Exception e) 
        {
            System.out.println("File not found");
        }
        //This code creates a JLabel that displays the time and changes its font and color
        JLabel textLabel = new JLabel("Time");
        textLabel.setFont(new Font("TimesRoman", Font.BOLD, 30)); 
        textLabel.setBounds(200, 400, 100, 100);
        textLabel.setForeground(Color.WHITE);
        
        //This creates the JTextField where the user will type in their name if they have a high score
        text.setSize(300,250);
        text.setBounds(200, 515, 150, 50);
        
        
        /*This creates a JLayeredPane which is how the window is displayed with all the elements 
        * The JPanel, JLabel and JTextField are added to the JLayeredPane
        */
        JLayeredPane pane = frame.getLayeredPane();
        pane.add(panel, new Integer(1));
        pane.add(textLabel, new Integer(2));
        pane.add(text, new Integer(2));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    public void actionPreformed(ActionEvent e)
    {
        userInput = text.getText();
    }
    
    public String getUserInput()
    {
        return userInput;
    }
    
    public static void main(String[] args)
    {
        createVictoryScreen2();
    }
}
