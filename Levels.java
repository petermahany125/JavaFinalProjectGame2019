import java.util.*;
import java.io.File;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Levels extends JPanel
{
    private Scanner scanner;
    private String file;
    private int xPaths;
    private int yPaths;
    private int xWalls;
    private int yWalls;
    private int xPixels;
    private int yPixels;
    private ArrayList<Block> blocks = new ArrayList<>();
    private ArrayList<Block> walls = new ArrayList<>();
    private ArrayList<Block> paths = new ArrayList<>();
    public Levels(String file)
    {
        ArrayList<String> wallsStrings = new ArrayList<>();
        ArrayList<String> pathsStrings = new ArrayList<>();
        clearListOfBlocks(walls);
        clearListOfBlocks(paths);
        clearListOfStrings(wallsStrings);
        clearListOfStrings(pathsStrings);
        ReadFile r = new ReadFile();
        this.file = file;
        r.openFile(file);
        r.readFile();
        r.closeFile();
        for(int j = 0; j < r.getWalls().length() - 3; j += 4)
        {
            xWalls = (Integer.parseInt(r.getWalls().substring(j,j+2)));
            yWalls = (Integer.parseInt(r.getWalls().substring(j+2,j+4)));
            Block block = new Block(xWalls,yWalls);
            walls.add(block);
            wallsStrings.add(Block.convertToString(block));
        }
        for(int k = 0; k < r.getPaths().length() - 3; k += 4)
        {
            xPaths = (Integer.parseInt(r.getPaths().substring(k,k+2)));
            yPaths = (Integer.parseInt(r.getPaths().substring(k+2,k+4)));
            Block block = new Block(xPaths,yPaths);
            paths.add(block);
            pathsStrings.add(Block.convertToString(block));
        }
        System.out.println(walls);
        System.out.println(paths);
        System.out.println(wallsStrings);
        System.out.println(pathsStrings);
        System.out.println("----");
        setBackground(Color.LIGHT_GRAY);
    }

    public void paintComponent(Graphics g)
    {
        g.setColor(Color.BLACK);
        for (Block block : walls)
        {
            xPixels = convertXToPixels(block.getX());
            yPixels = convertYToPixels(block.getY());
            g.fillRect(yPixels, xPixels, block.getSize(), block.getSize());
            blocks.add(new Block(xPixels, yPixels));
        }
        g.setColor(Color.WHITE);
        for (Block block : paths)
        {
            xPixels = convertXToPixels(block.getX());
            yPixels = convertYToPixels(block.getY());
            g.fillRect(yPixels, xPixels, block.getSize(), block.getSize());
            blocks.add(new Block(xPixels, yPixels));
        }
    }

    public ArrayList<Block> getBlocks()
    {
        return blocks;
    }
    
    public void clearListOfBlocks(ArrayList<Block> blocks)
    {
        for(int i = blocks.size() - 1; i >= 0; i--)
        {
            blocks.remove(blocks.get(i));
        }
    }

    public void clearListOfStrings(ArrayList<String> strings)
    {
        for(int i = strings.size() - 1; i >= 0; i--)
        {
            strings.remove(strings.get(i));
        }
    }

    public int convertXToPixels(int x)
    {
        return 50 + (50 * x);
    }

    public int convertYToPixels(int y)
    {
        return 50 + (50 * y);
    }

    public static void main(String[] args)
    {
        Frame frame = new Frame(700,700);
        frame.getContentPane().add(new Levels("Level1.txt"));
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.LIGHT_GRAY);
    }
}