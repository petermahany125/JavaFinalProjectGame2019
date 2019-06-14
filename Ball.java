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

public class Ball extends JPanel implements ActionListener, KeyListener
{
    private int x;
    private int y;
    private int xVel=0;
    private int yVel=0;
    private int rad=25;
    private Timer time = new Timer(4, this);
    private static Ball ball = new Ball(0,0);
    public Ball(int xCor, int yCor)
    {
        time.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        x = xCor;
        y = yCor; 
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.MAGENTA);
        g.fillOval(ball.getX(),ball.getY(),rad,rad);
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
    
    public void keyTyped(KeyEvent e)
    {
        
    }
    public void keyReleased(KeyEvent e)
    {
        
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public static void main(String args[])
    {
        JFrame frame = new JFrame();       
        frame.setTitle("Ball");
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(ball);
    }
}    
