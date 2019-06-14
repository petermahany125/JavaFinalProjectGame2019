import java.util.*;
import java.awt.Color;

public class Block
{
    private int length, width, x, y;
    private Color color;
    private Scanner scanner;
    public Block(int xCoor, int yCoor)
    {
        length = 50;
        width = 50;
        x = xCoor;
        y = yCoor;
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
    public static String convertToString(Block block)
    {
        return "Block: Length = " + block.getLength() + " Width = " + block.getWidth() + " Coordinates = (" 
        + block.getX() + "," + block.getY() + ")";
    }
}