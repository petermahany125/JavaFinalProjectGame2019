import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class TestAudio
{ 
   public static void main(String[] args)
   {
       File beginning = new File("Windows_Sci-fi_1998_start_up_sound-s0THF0iMrfQ.WAV");
       File robloxSound = new File("Roblox_Death_Sound_-_Sound_Effect_HD-3w-2gUSus34.WAV");
       File error = new File("Microsoft_Windows_98_Error_-_Sound_Effect_HD-9sycZ4GnUA4.WAV");
       File levelUp = new File("Level_Up_Sound_Effect-P_u0k2uElHI.WAV");
       File splat = new File("Cartoon_Splat_Sound_Effect-KcOLdg0PotI.WAV");
       
       playSound(beginning);
       
       playSound(robloxSound);
       
       playSound(error);
       
       playSound(levelUp);
       
       playSound(splat);
       
   }
   public static void playSound(File Sound)
   {
       try
       {
           Clip clip = AudioSystem.getClip();
           clip.open(AudioSystem.getAudioInputStream(Sound));
           clip.start();
           Thread.sleep(clip.getMicrosecondLength()/1000);
       }
       catch (Exception e)
       {      
       }
   }
}
