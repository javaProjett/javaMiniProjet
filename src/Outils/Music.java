package Outils;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.nio.file.Paths;

public class Music {
    private static final String MAIN_MENU_THEME = "src/Asset/Sons/Xenon.2.mp3";
    private static MediaPlayer mediaPlayer;
    private static double volume = 0.5;

    public static void playMainMenuMusic(){
        if (mediaPlayer != null) mediaPlayer.stop();
        mediaPlayer = new MediaPlayer(new Media(Paths.get(MAIN_MENU_THEME).toUri().toString()));
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.setVolume(volume);
        mediaPlayer.play();
    }
    public static void setVolume(double vol) {
        Music.volume = vol;
        mediaPlayer.setVolume(vol);
    }
}
