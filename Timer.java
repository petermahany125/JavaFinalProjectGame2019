//Sean McAleer
//A simple program that times an event.
import java.util.ArrayList;
public class Timer
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        ArrayList a = new ArrayList();
        
        //event
        for (int i = 1; i <= 10000000; i++)
        {
            a.add(i);
        }
 
        long end = System.currentTimeMillis();
        long diff = end - start;

        int min = (int)((diff/1000) / 60);
        diff -= (int)((min * 1000) * 60);
        int seconds = (int)((diff/1000) % 60);
        diff -= (int)(seconds * 1000);
        int milli = (int)(diff);

        System.out.println("Minutes: " + min + " Seconds: " + seconds + " Milliseconds: " + milli);
    }
}
