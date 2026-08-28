package devices;

public class MusicPlayer{
    private String currentPlaylist;
    private int volume = 50;


    public MusicPlayer(String currentPlaylist){
        this.currentPlaylist = currentPlaylist;
    }

    public void play(String playlist){
        this.currentPlaylist = playlist;
        System.out.println("Playing music from playlist: " + currentPlaylist);
    }

    public void stop(){
        System.out.println("Music playback stopped.");
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Music volume set to: " + volume);
    }

    public int getVolume(){
        return volume;
    }
}