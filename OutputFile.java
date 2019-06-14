import java.io.*;
import java.util.*;
public class OutputFile 
{
    private Scanner scanner;
    private static int[] arr = new int[3];
    public void openFile()
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
    
    public void input() throws IOException 
    {
        FileOutputStream out = new FileOutputStream("HighScoreOutput.txt");
        try 
        {
            for(int i = 0; i < arr.length - 1; i++) 
            {
                out.write(arr[i]);
            }
        }
        catch(Exception e) 
        {
            if (out != null) 
            {
                out.close();
            }
        } 
    }
    
    public void closeFile()
    {
        scanner.close();
    }
    
    public static void insertionSort(int[] arr)
    {
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
    }
    
    public static void main(String args[]) throws IOException 
    {  
        OutputFile o = new OutputFile();
        o.openFile();
        for (int i = 0; i < 3; i++)
        {
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        OutputFile.insertionSort(arr);
        System.out.println(arr);
        o.input();
        System.out.println("High score inputed");
        o.closeFile();
        System.out.println("Success");
    }
}