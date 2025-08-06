package catalogue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AudioEffectsTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void loadAudioFile() {
		AudioEffects sfx = new AudioEffects("/Users/sairkohistani/git/CI553-CW-miniStore/src/buttonClick.wav");
		assertEquals(sfx, "Success!");
	}
	
//	@Test
//	void loadUnsupportedFile() {
//		assertThrows(UnsupportedAudioFileException.class , () -> {
//			AudioEffects sfx = new AudioEffects("/Users/sairkohistani/git/CI553-CW-miniStore/src/buttonClick.mp3");
//		});
//	}
	
	@Test
	void loadUnsupportedFile() {
		AudioEffects sfx = new AudioEffects("/Users/sairkohistani/git/CI553-CW-miniStore/src/buttonClick.mp3");
	}
	
	@Test
	void playAudio() {
		AudioEffects sfx = new AudioEffects("/Users/sairkohistani/git/CI553-CW-miniStore/src/buttonClick.wav");
		sfx.play();
		equals("Audio is playing");
	}
	
	@Test
	void stopAudio() {
		AudioEffects sfx = new AudioEffects("/Users/sairkohistani/git/CI553-CW-miniStore/src/buttonClick.wav");
		sfx.stop();
		equals("Audio has stopped");
	}
	
	@Test
	void clowAudio() {
		AudioEffects sfx = new AudioEffects("/Users/sairkohistani/git/CI553-CW-miniStore/src/buttonClick.wav");
		sfx.close();
		equals("Audio is closed");
	}
	

}
