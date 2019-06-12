import java.awt.*;
import javax.swing.*;
<<<<<<< HEAD
import java.awt.Font;

=======
>>>>>>> 007603d47af990872dc23960db063e96f5323b9f
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
        
<<<<<<< HEAD
        Font myFont = new Font("Serif", Font.ITALIC | Font.BOLD, 12);
        Font newFont = myFont.deriveFont(50F);
=======
        JPanel p = new JPanel();
        p.setLayout(null);
>>>>>>> 007603d47af990872dc23960db063e96f5323b9f
        
<<<<<<< HEAD
        textLabel.setFont(newFont);
        
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

