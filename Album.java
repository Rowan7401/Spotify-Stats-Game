public class Album {
    String albumName;
    int songCount;
    Song mostPlayedSong;
    Song rowsFavSong;
    String releaseDate;

    public Album(String albumName, int songCount, Song mostPlayedSong, Song rowsFavSong, String releaseDate) {
        this.albumName = albumName;
        this.songCount = songCount;
        this.mostPlayedSong = mostPlayedSong;
        this.rowsFavSong = rowsFavSong;
        this.releaseDate = releaseDate;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getSongCount() {
        return songCount;
    }

    public Song getMostPlayedSong() {
        return mostPlayedSong;
    }

    public Song getRowsFavSong() {
        return rowsFavSong;
    }
    public String getReleaseDate() {
        return releaseDate;
    }

    public String toString() {
        String albumInfo = getAlbumName() + " is an album with " + getSongCount()
         + " songs. \nIts most popular song " + getMostPlayedSong() + ", but Rowan's favorite song " 
         + getRowsFavSong() + ".";
        return albumInfo;
    }


    
    

    
}