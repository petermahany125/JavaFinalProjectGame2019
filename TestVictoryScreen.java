import java.awt.*;
import javax.swing.*;
import java.awt.Font;

public class TestVictoryScreen
{
    private static void createStartingScreen()
    {
        JFrame frame = new JFrame("Java Final");
        
        JLabel textLabel = new JLabel("Congratulations you won!", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(50, 50));
        frame.getContentPane().add(textLabel, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.RED);
        
        Font myFont = new Font("Serif", Font.ITALIC | Font.BOLD, 12);
        Font newFont = myFont.deriveFont(50F);
        JPanel p = new JPanel();
        p.setLayout(null);
        
        textLabel.setFont(newFont);
        
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.add(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
    public static void main(String[] args)
    {
        createStartingScreen();
    }
}

