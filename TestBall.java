//Rajiv Srinath
//Ball
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
public class TestBall extends JPanel implements ActionListener, KeyListener
{
    private int x=0;
    private int y=0;
    private int xVel=0;
    private int yVel=0;
    private int rad=25;
    private Timer time = new Timer(4, this);
    public TestBall(int x, int y)
    {
        time.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        this.x=x;
        this.y=y;
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.MAGENTA);
        g.fillOval(x,y,rad,rad);
    }

    public void actionPerformed(ActionEvent e)
    {
        x+=xVel;
        y+=yVel;
        repaint();
    }

    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT)
        {
            xVel = 2;
            yVel = 0;
        }
        else if (key == KeyEvent.VK_LEFT)
        {
            xVel = -2;
            yVel = 0;
        }
        else if (key == KeyEvent.VK_DOWN)
        {
            yVel = 2;
            xVel = 0;
        }
        else if  (key == KeyEvent.VK_UP)
        {
            yVel = -2;
            xVel = 0;
        }
        repaint();
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void keyTyped(KeyEvent e)
    {

    }

    public void keyReleased(KeyEvent e)
    {

    }

    public static void main(String args[])
    {
        TestBall test = new TestBall(0,0);
        JFrame testJ = new JFrame();
        testJ.setTitle("Ball");
        testJ.setSize(600,600);
        testJ.setVisible(true);
        testJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testJ.add(test);
    }
}

