import java.awt.*;
import javax.swing.*;
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
        
        JPanel p = new JPanel();
        p.setLayout(null);
        
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

