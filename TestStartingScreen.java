
import java.awt.*;
import javax.swing.*;

public class TestStartingScreen
{
    private static void createStartingScreen()
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Java Final");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.blue);
        
        JLabel textLabel = new JLabel("PAINT THE SPACES!", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(100, 100));
        frame.getContentPane().add(textLabel, BorderLayout.NORTH);
        
        JButton play = new JButton("PLAY");
        play.setSize(new Dimension(500, 500));
        frame.getContentPane().add(play, BorderLayout.SOUTH);
        
        
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        
    }
    
    

    public static void main(String[] args)
    {
        createStartingScreen();
    }
}
