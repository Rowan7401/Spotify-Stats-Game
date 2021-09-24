public class Song {
    String songOwner;
    String songName;
    String features;
    String appearsOn;
    String songLength;
    int numPlays;

    public Song(String songOwner, String songName, String features, String appearsOn, String songLength, int numPlays) {
        this.songOwner = songOwner;
        this.songName = songName;
        this.features = features;
        this.appearsOn = appearsOn;
        this.songLength = songLength;
        this.numPlays = numPlays;
    }

    public String getSongOwner() {
        return songOwner;
    }
    public String getSongName() {
        return songName;
     }

    public String getFeatures() {
        return features;
    }
    public String getAlbumAppearsOn() {
        return appearsOn;
    }

    public String getSongLength() {
        return songLength;
    }

    public int getNumPlays() {
        return numPlays;
    }

    public String toString() {
        String songInfo = "";
        if (getFeatures() == null) {
            songInfo += getSongName() + " is a song with no features. It is " + getSongLength()
             + "in length and has " + getNumPlays() + " plays";
            return songInfo;
        }
        else { 
            songInfo += getSongName() + " features " + getFeatures() + ". It is " + getSongLength() 
            + " in length and has " + getNumPlays() + " plays";
        return songInfo;
        }
    }
}
