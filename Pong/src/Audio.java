import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;

public class Audio {
    public static void RunMusic(String path){
        try{
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path));
            Clip clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.setMicrosecondPosition(0);
            clip.start();
        }catch (UnsupportedAudioFileException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (LineUnavailableException e ){
            e.printStackTrace();
        }
    }
}
