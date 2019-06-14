import java.io.*;
import java.util.*;
public class OutputFile 
{
    private Scanner scanner;
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
    
    public void output(int arr[]) throws IOException 
    {
        FileOutputStream out = new FileOutputStream("HighScoreOutput.txt");
        try 
        {
            for(int i = 0; i < arr.length; i++) 
            {
                //CHECK THIS JAVA API
                out.write(arr[i]);
            }
            out.close();
        }
        catch(Exception e) 
        {
            System.out.println("Error occured");
            if (out != null) 
            {
                out.close();
            }
        } 
    }
    
    public void closeFileRead()
    {
        scanner.close();
    }
    
    public static void main(String args[]) throws IOException 
    {  
        OutputFile o = new OutputFile();
        int[] arr = new int[3];
    
        o.openFileRead();
        //REPLACE ME WITH CODE TO READ THE DATA INTO THE ARRAY
        for (int i = 0; i < 3; i++)
        {
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        
        o.closeFileRead();
        
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
        for (int i =0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
        o.output(arr);
        System.out.println("High score inputed");
    }
}