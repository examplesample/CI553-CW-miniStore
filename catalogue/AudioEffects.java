package catalogue;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * Used to handle audio files, which can only play WAV files.
 * JLayer can be imported to play MP3 files.
 * 
 * @author Sair Kohistani
 * @version 1.0
 */

public class AudioEffects  {
    private Clip clip;
    
    /**
     * Loads an audio file
     * @param filePath Placeholder value
     */

    public AudioEffects(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new IOException("Audio file not found: " + filePath);
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            System.out.println("Success!");
        } catch (UnsupportedAudioFileException e) {
            System.err.println("Invalided audio file: " + filePath);
        } catch (LineUnavailableException e) {
            System.err.println("The audio line is unavailable");
        } catch (IOException e) {
            System.err.println("Issues loading the audio file: " + e.getMessage());
        }
    }

    /**
     * Plays the loaded audio file
     */
    public void play() {
        if (clip != null) {
            if (clip.isRunning()) {
                clip.stop();
            }
            clip.setFramePosition(0);
            clip.start();
            System.out.println("Audio is playing");
        }
    }

    /**
     * Stops the loaded audio file
     */
    public void stop() {
        if (clip != null) {
            clip.stop();
            System.out.println("Audio has stopped");
        }
    }

    /**
     * Closes the audio file
     */
    public void close() {
        if (clip != null) {
            clip.close();
            System.out.println("Audio is closed");
        }
    }
}
