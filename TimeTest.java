//Sean McAleer
//A simple program that times an event.
public class TimeTest
{
    public static void main(String[] args)
    {
        System.out.println("Begin Time in milliseconds: ");
        long start = System.currentTimeMillis();
        System.out.println(start);
        
        //Event
        
        System.out.println("End Time in milliseconds: ");
        long end = System.currentTimeMillis();
        System.out.println(end);
        
        long diffInTime = end - start;
        System.out.println("Differential in Time: " + diffInTime);
    }
}
