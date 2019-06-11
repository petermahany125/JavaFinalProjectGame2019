//Rajiv Srinath
//Ball

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
/**
 * Write a description of class TestBall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestBall
{
    private Image image;
    private int x=50;
    private int y=70;
    private int x2;
    private int y2;
    
    public TestBall()
    {
        createImage();
    }
    
    private void createImage()
    {
        ImageIcon ball = new ImageIcon("src/resources/spaceship.png");
        image = ball.getImage();
    }
}
