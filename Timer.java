//Sean McAleer
//A simple program that times an event.
import java.util.ArrayList;
public class Timer
{
    public static void main(String[] args)
    {
        //creates variable to store initial time
        long start = System.currentTimeMillis();
        ArrayList a = new ArrayList();
        
        //event that runs through an extensive for loop
        for (int i = 1; i <= 10000000; i++)
        {
            a.add(i);
        }
 
        //creates variables to store the ending time and the difference between the start time and end time
        long end = System.currentTimeMillis();
        long diff = end - start;

        //converts total milliseconds to the accurate minutes, seconds, and millisceonds
        int min = (int)((diff/1000) / 60);
        diff -= (int)((min * 1000) * 60);
        int seconds = (int)((diff/1000) % 60);
        diff -= (int)(seconds * 1000);
        int milli = (int)(diff);

        //prints the results of the timer
        System.out.println("Minutes: " + min + " Seconds: " + seconds + " Milliseconds: " + milli);
    }
}
