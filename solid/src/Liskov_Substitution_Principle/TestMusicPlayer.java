package Liskov_Substitution_Principle;

public class TestMusicPlayer {
    static void testMusicPlayer(MusicPlayer musicPlayer){
        musicPlayer.play();
        musicPlayer.stop();
    }
    public static void main (String[] args) {
        testMusicPlayer(new MusicPlayer());
        testMusicPlayer(new AudioMediaPlayer());
        testMusicPlayer(new VideoMediaPlayer());
    }

}
class MusicPlayer {
    public void play(){
        System.out.println("\nPlaying Music Player!");
    }
    public void stop(){
        System.out.println("Stopping Music Player!\n");
    }
}

class AudioMediaPlayer extends MusicPlayer{
    public void play(){
        System.out.println("Playing Audio Media Player!");
    }
    public void stop(){
        System.out.println("Stopping Audio Media Player!\n");
    }
}

class VideoMediaPlayer extends MusicPlayer{
    public void play(){
        System.out.println("Playing Video Media Player!");
    }
    public void stop(){
        System.out.println("Stopping Video Media Player!\n");
    }
}