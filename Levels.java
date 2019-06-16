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
    private ArrayList<Block> walls = new ArrayList<>();
    private ArrayList<Block> paths = new ArrayList<>();
    public Levels()
    {
        ArrayList<String> textFiles = new ArrayList<>();
        ArrayList<String> wallsStrings = new ArrayList<>();
        ArrayList<String> pathsStrings = new ArrayList<>();
        int levelCounter = 1;
        textFiles.add("Level1.txt");
        textFiles.add("Level2.txt");
        textFiles.add("Level3.txt");
        /* textFiles.add("Level4.txt");
         * textFiles.add("Level5.txt");
         * textFiles.add("Level6.txt");
         * textFiles.add("Level7.txt");
         * textFiles.add("Level8.txt");
         * textFiles.add("Level9.txt");
         * textFiles.add("Level10.txt");
         */
        for(int i = 0; i < textFiles.size(); i++)
        {
            clearListOfBlocks(walls);
            clearListOfBlocks(paths);
            clearListOfStrings(wallsStrings);
            clearListOfStrings(pathsStrings);
            ReadFile r = new ReadFile();
            file = textFiles.get(i);
            System.out.println("Level " + levelCounter + ": ");
            r.openFile(file);
            r.readFile();
            r.closeFile();
            for(int j = 0; j < r.getWalls().length() - 4; j += 4)
            {
                xWalls = (Integer.parseInt(r.getWalls().substring(j,j+2)));
                yWalls = (Integer.parseInt(r.getWalls().substring(j+2,j+4)));
                Block block = new Block(xWalls,yWalls);
                walls.add(block);
                wallsStrings.add(Block.convertToString(block));
            }
            for(int k = 0; k < r.getPaths().length() - 4; k += 4)
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
            levelCounter++;
        }
    }

    public void paintComponent(Graphics g)
    {
        g.drawRect(50,50,600,600);
        for (Block block : walls)
        {
            xPixels = convertXToPixels(xWalls);
            yPixels = convertYToPixels(yWalls);
            block.draw(g, xPixels, yPixels, Color.BLACK);
        }
        for (Block block : paths)
        {
            xPixels = convertXToPixels(xPaths);
            yPixels = convertYToPixels(yPaths);
            block.draw(g, xPixels, yPixels, Color.WHITE);
        }
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
        frame.getContentPane().add(new Levels());
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.LIGHT_GRAY);
    }
}