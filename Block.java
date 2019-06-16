import java.util.*;
import java.awt.Color;
import java.awt.Graphics;
public class Block
{
    private int size, x, y;
    private Color color;
    private Scanner scanner;
    public Block(int xCoor, int yCoor)
    {
        size = 50;
        x = xCoor;
        y = yCoor;
    }
    
    public int getSize()
    {
        return size;
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
        return "Block: Length = " + block.getSize() + " Width = " + block.getSize() + " Coordinates = (" 
        + block.getX() + "," + block.getY() + ")";
    }
}