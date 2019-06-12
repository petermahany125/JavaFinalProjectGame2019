
import java.awt.*;
import javax.swing.*;
import java.awt.Font;

public class TestVictoryScreen
{
    private static void createVictoryScreen()
    {
        
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Java Final");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.red);
        
        JLabel textLabel = new JLabel("CONGRATULATIONS! YOU WON!", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(100, 100));
        frame.getContentPane().add(textLabel, BorderLayout.NORTH);
        
        Font myFont = new Font("Serif", Font.ITALIC | Font.BOLD, 12);
        Font newFont = myFont.deriveFont(50F);
        
        textLabel.setFont(newFont);
        
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        
    }
    
    

    public static void main(String[] args)
    {
        createVictoryScreen();
        
    }
}

