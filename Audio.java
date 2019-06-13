import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class Audio
{ 
   private File beginning = new File("Windows_Sci-fi_1998_start_up_sound-s0THF0iMrfQ.WAV");
   private File robloxSound = new File("Roblox_Death_Sound_-_Sound_Effect_HD-3w-2gUSus34.WAV");
   private File error = new File("Microsoft_Windows_98_Error_-_Sound_Effect_HD-9sycZ4GnUA4.WAV");
   private File levelUp = new File("Level_Up_Sound_Effect-P_u0k2uElHI.WAV");
   private File splat = new File("Cartoon_Splat_Sound_Effect-KcOLdg0PotI.WAV");
   
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
   
   public void playBeginning()
   {
       playSound(beginning);
   }
   
   public void playRoblox()
   {
       playSound(robloxSound);
   }
   
   public void playError()
   {
       playSound(error);
   }
   
   public void playLevelUp()
   {
       playSound(levelUp);
   }
   
   public void playSplat()
   {
       playSound(splat);
   }
}