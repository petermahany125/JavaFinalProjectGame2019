import java.io.FileOutputStream;  
public class OutputFile 
{
    public void openFile()
    {

    }

    public void outputIntoFile()
    {

    }

    public void closeFile()
    {

    }

    public static void main(String args[])
    {    
        try
        {    
            FileOutputStream a = new FileOutputStream("HighScoreOutput.txt");    
            a.write(65);    
            a.close();    
            System.out.println("success...");    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }    
    }    
}