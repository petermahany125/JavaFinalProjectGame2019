//Sean McAleer
import java.io.*;
import java.util.*;
public class OutputFile 
{
    private Scanner scanner;
    //opens the file "HighScoreOutput.txt"
    public void openFileRead()
    {
        try
        {
            scanner = new Scanner (new File 
                ("HighScoreOutput.txt"));
        }
        catch(Exception e)
        {
            System.out.println("No file was found");
        }
    } 

    //outputs the three random numbers representing the high scores
    public void output(int arr[]) throws IOException 
    {
        String pathname = "HighScoreOutput.txt";
        File file = new File(pathname);
        PrintWriter output = null;

        int fNum = arr[0];
        int sNum = arr[1];
        int tNum = arr[2];
        try 
        {
            output = new PrintWriter(file);
        }
        catch(IOException ex) 
        {
            System.out.println("Error occured");
            System.exit(1);
        }

        //methods used to display high score
        output.println("High Score: ");
        output.printf("%d, %d, %d", fNum, sNum, tNum);
        output.close();
    }

    //closes file after it is read
    public void closeFileRead()
    {
        scanner.close();
    }

    //performs the event of displaying high scores by invoking various methods
    public static void main(String args[]) throws IOException 
    {  
        OutputFile o = new OutputFile();
        int[] arr = new int[3];
        o.openFileRead();
        //REPLACE ME WITH CODE TO READ THE DATA INTO THE ARRAY in Game class
        for (int i = 0; i < 3; i++)
        {
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        o.closeFileRead();

        //selection sort of three random numbers representing the highscores
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[index])
                {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        o.output(arr);
        System.out.println("High score inputed");
    }
}
