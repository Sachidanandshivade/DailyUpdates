class MusicApp {
    public static void main(String[] args) {
        Song hitSong = new Song();
        hitSong.title = "Shape of You";
        hitSong.artist = "Ed Sheeran";

        Playlist myPlaylist = new Playlist();
        myPlaylist.track = hitSong;
        myPlaylist.playSong(hitSong);

        System.out.println("Now playing: " + hitSong.title + " by " + hitSong.artist);
        System.out.println("Playlist contains: " + myPlaylist.track.title + " by " + myPlaylist.track.artist);  
    }
}

class Song {
    String title;
    String artist;
}

class Playlist {
    Song track;

    void playSong(Song banger) {
        track = banger;
        System.out.println("Playing: " + track.title + " by " + track.artist);
    }
}