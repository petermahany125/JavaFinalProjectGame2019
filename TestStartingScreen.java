import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class TestStartingScreen
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
        
<<<<<<< HEAD
        JPanel buttonPanel = new JPanel(new GridLayout(0, 3, 6, 5));
        buttonPanel.setBorder(new EmptyBorder(338, 233, 0, 0));
        JButton play = new JButton("PLAY");
        play.setPreferredSize(new Dimension(100, 200));
        frame.getContentPane().add(play, BorderLayout.CENTER);
        
        
        
        frame.setLocationRelativeTo(null);
        frame.pack();
=======
        frame.add(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
>>>>>>> 007603d47af990872dc23960db063e96f5323b9f
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
    public static void main(String[] args)
    {
        createStartingScreen();
    }
}
