import java.util.*;
import java.io.File;
public class TestReadFile
{
    private Scanner scanner;
    private String sp;
    private String numWalls;
    private String walls;
    private String numPaths;
    private String paths;
    private String file = "Level1.txt";
    public void openFile()
    {
        try
        {
            scanner = new Scanner (new File 
                (file));
        }
        catch(Exception e)
        {
            System.out.println("No file was found");
        }
    } 
    
    public void readFile()
    {
        sp = scanner.next();
        numWalls = scanner.next();
        walls = "";
        paths = "";
        while(scanner.hasNext())
        {
            for(int i = 1; i <= Integer.parseInt(numWalls); i++)
            {
                walls += scanner.next();
            }
            numPaths = scanner.next();
            for(int j = 1; j <= Integer.parseInt(numPaths); j++)
            {
                paths += scanner.next();
            }
            System.out.println("Starting Postion: " + sp + "\nWalls: " + walls + "\nPaths: " + paths);
        }
    }
    
    public String getSP()
    {
        return sp;
    }
    
    public int getNumWalls()
    {
        return Integer.parseInt(numWalls);
    }
    
    public String getWalls()
    {
        return walls;
    }
    
    public int getNumPaths()
    {
        return Integer.parseInt(numPaths);
    }
    
    public String getPaths()
    {
        return paths;
    }
    
    public String getFileName()
    {
        return file;
    }
    
    public void setFileName(String file)
    {
        this.file = file;
    }
    
    public void closeFile()
    {
        scanner.close();
    }
    
    public static void main(String[] args)
    {
        TestReadFile r = new TestReadFile();
        r.openFile();
        r.readFile();
        r.closeFile();
    }
}
