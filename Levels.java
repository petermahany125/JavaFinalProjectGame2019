import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Levels extends JPanel
{
    public void paint(Graphics g)
    {
        g.fillRect(50, 50, 600, 600);
    }
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(700,700);
        frame.getContentPane().add(new Levels());
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }  
}