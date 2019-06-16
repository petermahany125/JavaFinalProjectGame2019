import javax.swing.JFrame;
public class Frame extends JFrame
{
    public Frame(int x, int y) 
    {
        setTitle("Paint the spaces");
        setSize(x,y);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        Frame f = new Frame(700,700);
    }
}
