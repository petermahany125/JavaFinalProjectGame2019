import java.io.File;
import java.io.IOException; 
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class TestAudio
{ 
    // to store current position 
    Long currentFrame; 
    Clip clip; 
    
    // current status of clip 
    String status; 
    
    AudioInputStream audioInputStream; 
    static String filePath; 
    
    // constructor to initialize streams and clip 
    public TestAudio() 
        throws UnsupportedAudioFileException, 
        IOException, LineUnavailableException  
    { 
        // create AudioInputStream object 
        audioInputStream =  
                AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile()); 
          
        // create clip reference 
        clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
          
        clip.loop(Clip.LOOP_CONTINUOUSLY); 
    } 
  
    public static void main(String[] args)  
    { 
        try
        {
            filePath = ""; 
            TestAudio audioPlayer =  
                            new TestAudio(); 
              
            audioPlayer.play(); 
            Scanner sc = new Scanner(System.in); 
            sc.close(); 
        }  
          
        catch (Exception ex)  
        { 
            System.out.println("Error with playing sound."); 
            ex.printStackTrace(); 
          
          } 
    }
      
    // Method to play the audio 
    public void play()  
    { 
        //start the clip 
        clip.start(); 
          
        status = "play"; 
    } 
      
    // Method to restart the audio 
    public void restart() throws IOException, LineUnavailableException, 
                                            UnsupportedAudioFileException  
    { 
        clip.stop(); 
        clip.close(); 
        resetAudioStream(); 
        currentFrame = 0L; 
        clip.setMicrosecondPosition(0); 
        this.play(); 
    } 
    
    // Method to reset audio stream
    public void resetAudioStream() throws UnsupportedAudioFileException, IOException, 
                                            LineUnavailableException  
    { 
        audioInputStream = AudioSystem.getAudioInputStream( 
        new File(filePath).getAbsoluteFile()); 
        clip.open(audioInputStream); 
        clip.loop(Clip.LOOP_CONTINUOUSLY); 
    } 
}
