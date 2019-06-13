import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class TestStartingScreen extends Levels
{
    private static void createStartingScreen()
    {
        JFrame frame = new JFrame("Java Final");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.blue);
        
        JLabel textLabel = new JLabel("PAINT THE SPACES!", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(50, 50));
        frame.getContentPane().add(textLabel, BorderLayout.NORTH);

        JButton button = new JButton("PLAY");
        JPanel p = new JPanel();
        p.setLayout(null);
        button.setBounds(300, 300, 75, 30);
        p.add(button);
        
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.add(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(SCREEN_LENGTH,SCREEN_WIDTH);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
    public static void main(String[] args)
    {
        createStartingScreen();
    }
}
