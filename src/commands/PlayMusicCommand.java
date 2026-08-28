package commands;
import devices.MusicPlayer;

public class PlayMusicCommand implements Command{
    private final MusicPlayer musicPlayer;
    private final String playlist;

    public PlayMusicCommand(MusicPlayer musicPlayer, String playlist){
        this.musicPlayer = musicPlayer;
        this.playlist = playlist;
    }

    @Override
    public void execute(){
        musicPlayer.play(playlist);
    }
}
