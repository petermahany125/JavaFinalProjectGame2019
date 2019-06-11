import java.io.File; 
import java.util.Scanner; 
public class TestReadFile 
{
    private Scanner scanner;
    public void openFile()
    {
        try
        {
            scanner = new Scanner (new File 
                ("C://Users//AMG_Z//Desktop//Level1.txt"));
        }
        catch(Exception e)
        {
            System.out.println("No file was found");
        }
    }

    public void readFile()
    {
        String len = scanner.next();
        String wid = scanner.next();
        String sp = scanner.next();
        String numWalls = scanner.next();
        String walls = "";
        String numPaths = null;
        String paths = "";
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
            System.out.println("Length:" + len + "\nWidth: " + wid + "\nStarting Postion: " + sp + "\nWalls: " + walls + "\nPaths: " + paths);
        }
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