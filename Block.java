import java.util.*;
import java.awt.Color;
public class Block
{
    private int length, width, x, y;
    private Color color;
    private Scanner scanner;
    public Block(int len, int wid, int xCor, int yCor)
    {
        length = len;
        width = wid;
        x = xCor;
        y = yCor;
    }
    public Block(Color color)
    {
        this.color = color; 
    }
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
}
