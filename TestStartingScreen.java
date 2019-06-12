
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

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
        
        JPanel buttonPanel = new JPanel(new GridLayout(0, 3, 6, 5));
        buttonPanel.setBorder(new EmptyBorder(338, 233, 0, 0));
        JButton play = new JButton("PLAY");
        play.setPreferredSize(new Dimension(100, 200));
        frame.getContentPane().add(play, BorderLayout.CENTER);
        
        
        
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        
    }
    
    

    public static void main(String[] args)
    {
        createStartingScreen();
    }
}
