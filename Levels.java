import java.util.*;
import java.io.File;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Levels extends JPanel
{
    private Scanner scanner;
    private String sp;
    private String numWalls;
    private String walls;
    private String numPaths;
    private String paths;
    private String file;
    public Levels()
    {
        String file;
        ArrayList<String> textFiles = new ArrayList<>();
        ArrayList<Block> walls = new ArrayList<>();
        ArrayList<Block> paths = new ArrayList<>();
        ArrayList<String> wallsStrings = new ArrayList<>();
        ArrayList<String> pathsStrings = new ArrayList<>();
        int levelCounter = 1;
        textFiles.add("Level1.txt");
        textFiles.add("Level1.txt");
         /* textFiles.add("Level3.txt");
         * textFiles.add("Level4.txt");
         * textFiles.add("Level5.txt");
         * textFiles.add("Level6.txt");
         * textFiles.add("Level7.txt");
         * textFiles.add("Level8.txt");
         * textFiles.add("Level9.txt");
         * textFiles.add("Level10.txt");
         */
        for(int i = 0; i < textFiles.size(); i++)
        {
            ReadFile r = new ReadFile();
            file = textFiles.get(i);
            System.out.println("Level " + levelCounter + ": ");
            r.openFile(file);
            r.readFile();
            for(int j = 0; j < r.getWalls().length() - 4; j += 6)
            {
                if(r.getWalls().charAt(j) != ',' && r.getWalls().charAt(j) != '.')
                {
                    Block block = new Block((Integer.parseInt(r.getWalls().substring(j,j+2))),
                            (Integer.parseInt(r.getWalls().substring(j+3,j+5))));
                    walls.add(block);
                    wallsStrings.add(Block.convertToString(block));
                }
            }
            for(int k = 0; k < r.getPaths().length() - 4; k += 6)
            {
                if(r.getPaths().charAt(k) != ',' && r.getPaths().charAt(k) != '.')
                {   
                    Block block = new Block((Integer.parseInt(r.getPaths().substring(k,k+2))),
                            (Integer.parseInt(r.getPaths().substring(k+3,k+5))));
                    paths.add(block);
                    pathsStrings.add(Block.convertToString(block));
                }
            }
            r.closeFile();
            System.out.println(walls);
            System.out.println(paths);
            System.out.println(wallsStrings);
            System.out.println(pathsStrings);
            System.out.println("----");
            levelCounter++;
        }
    }

    public void paint(Graphics g)
    {
        g.fillRect(50,50,600,600);
        g.setColor(Color.RED);
        g.fillRect(50,50,50,50);
        g.setColor(Color.BLUE);
        g.fillRect(50,100,50,50);
        g.fillRect(100,50,50,50);
        g.setColor(Color.RED);
        g.fillRect(100,100,50,50);
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