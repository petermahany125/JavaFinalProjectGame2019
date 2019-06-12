import java.util.*;
import java.io.File;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Levels extends JPanel
{
    private Scanner scanner;
    private String len;
    private String wid;
    private String sp;
    private String numWalls;
    private String walls;
    private String numPaths;
    private String paths;
    public Levels()
    {
        ArrayList<String> textFiles = new ArrayList<>();
        ArrayList<Block> walls = new ArrayList<>();
        ArrayList<Block> paths = new ArrayList<>();
        textFiles.add("Level1.txt");
        /*
         * textFiles.add("Level2.txt");
         * textFiles.add("Level3.txt");
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
            TestReadFile r = new TestReadFile();
            String file = textFiles.get(i);
            r.setFileName(file);
            r.openFile();
            r.readFile();
            r.closeFile();
            for(int j = 1; j < r.getWalls().length(); j+=4)
            {
                if(r.getWalls().charAt(j) == '(' || r.getWalls().charAt(j) == ')' || r.getWalls().charAt(j) == ',')
                {
                    Block block = new Block(50,50,(Integer.parseInt(r.getWalls().substring(j,j+1))),
                    (Integer.parseInt(r.getWalls().substring(j+2,j+3))));
                    walls.add(block);
                }
            }
            for(int k = 1; k < r.getPaths().length(); k+=4)
            {
                Block block = new Block(50,50,(Integer.parseInt(r.getWalls().substring(k,k+1))),
                (Integer.parseInt(r.getWalls().substring(k+2,k+3))));
                paths.add(block);
            }
        }
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